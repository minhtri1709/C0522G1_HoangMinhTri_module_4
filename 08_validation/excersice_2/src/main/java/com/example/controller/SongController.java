package com.example.controller;

import com.example.dto.SongDto;
import com.example.model.Song;
import com.example.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/song")
public class SongController {

    @Autowired
    private ISongService iSongService;

    @GetMapping("/list")
    public String getList(@PageableDefault(value = 3) Pageable pageable, Model model){
        Page<Song> songs = iSongService.findAll(pageable);
        model.addAttribute("songList",songs);
        return "list";
    }

    @GetMapping("/create")
    public String getCreateForm(Model model){
        model.addAttribute("songDto",new SongDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated SongDto songDto, BindingResult bindingResult){

        if(bindingResult.hasFieldErrors()){
            return "create";
        }
        else {
            Song user = new Song();
            BeanUtils.copyProperties(songDto,user);
            iSongService.save(user);
            return "redirect:/song/list";
        }
    }


    @GetMapping("/{id}/edit")
    public String getEditForm(@PathVariable int id, Model model){
        model.addAttribute("song",iSongService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Song song){
        iSongService.save(song);
        return "redirect:/song/list";
    }
}
