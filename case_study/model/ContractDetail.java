package model;

public class ContractDetail {
    private int id;
    private int contractId;
    private int attachFacilityId;
    private int quantily;

    public ContractDetail() {
    }

    public ContractDetail(int id, int contractId, int attachFacilityId, int quantily) {
        this.id = id;
        this.contractId = contractId;
        this.attachFacilityId = attachFacilityId;
        this.quantily = quantily;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getAttachFacilityId() {
        return attachFacilityId;
    }

    public void setAttachFacilityId(int attachFacilityId) {
        this.attachFacilityId = attachFacilityId;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }
}
