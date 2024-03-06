package com.wallet.walletwisesb.entity;

public class TransferHistory {
    private int id_transfer;
    private int debit_transaction_id;
    private int credit_transaction_id;
    private String transfer_date;

    public TransferHistory(int id_transfer, int debit_transaction_id, int credit_transaction_id, String transferDate) {
        this.id_transfer = id_transfer;
        this.debit_transaction_id = debit_transaction_id;
        this.credit_transaction_id = credit_transaction_id;
        this.transfer_date = transferDate;
    }

    public int getIdTransfer() {
        return id_transfer;
    }

    public void setIdTransfer(int idTransfer) {
        this.id_transfer = idTransfer;
    }

    public int getDebitTransactionId() {
        return debit_transaction_id;
    }

    public void setDebitTransactionId(int debitTransactionId) {
        this.debit_transaction_id = debitTransactionId;
    }

    public int getCreditTransactionId() {
        return credit_transaction_id;
    }

    public void setCreditTransactionId(int creditTransactionId) {
        this.credit_transaction_id = creditTransactionId;
    }


    public String  getTransferDate() {
        return transfer_date;
    }

    public void setTransferDate(String transferDate) {
        this.transfer_date = transferDate;
    }

    @Override
    public String toString() {
        return "TransferHistory{" +
                "idTransfer=" + id_transfer +
                ", debitTransactionId=" + debit_transaction_id +
                ", creditTransactionId=" + credit_transaction_id +
                ", transferDate='" + transfer_date + '\'' +
                '}';
    }
}

