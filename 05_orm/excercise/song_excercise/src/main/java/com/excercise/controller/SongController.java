package com.excercise.controller;

import com.excercise.model.Song;
import com.excercise.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {

    @Autowired
    ISongService iSongService;

    @GetMapping("list")
    public String getHome(Model model){
        List<Song>songList = iSongService.findAll();
        model.addAttribute("songList",songList);
        return "index";
    }

    @GetMapping("{id}/delete")
    public String getDelete(@PathVariable int id, Model model){
        model.addAttribute("song",iSongService.findById(id));
        return "delete";
    }

    @GetMapping("{id}/edit")
    public String getEdit(@PathVariable int id, Model model){
        model.addAttribute("song",iSongService.findById(id));
        return "edit";
    }

    @PostMapping("update")
    public String update(Song song, RedirectAttributes redirectAttributes){
        iSongService.update(song);
        redirectAttributes.addFlashAttribute("message","Suceess");
        return "redirect:/song/list";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("song", iSongService.findById(id));
        return "view";
    }

    @GetMapping("/create")
    public String getCreate(Model model){
        model.addAttribute("song",new Song());
        return "create";
    }

    @PostMapping("save")
    public String save(Song song, RedirectAttributes redirect){
        song.setId((int) (Math.random() * 1000));
        iSongService.save(song);
        redirect.addFlashAttribute("mess","Success");
        return "redirect:/song/list";
    }

    @PostMapping("/delete")
    public String delete(Song song, RedirectAttributes redirectAttributes){
        iSongService.delete(song.getId());
        redirectAttributes.addFlashAttribute("success","Removed product successfully");
        return "redirect:/song/list";
    }
}
