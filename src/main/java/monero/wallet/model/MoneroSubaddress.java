package monero.wallet.model;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

/**
 * Monero subaddress model.
 */
public class MoneroSubaddress {

  private MoneroAccount account;
  private Integer index;
  private String label;
  private String address;
  private BigInteger balance;
  private BigInteger unlockedBalance;
  private Integer numUnspentOutputs;
  private Boolean isUsed;
  
  public MoneroSubaddress() {
    super();
  }
  
  public MoneroSubaddress(String address) {
    super();
    this.address = address;
  }
  
  public MoneroAccount getAccount() {
    return account;
  }

  public void setAccount(MoneroAccount account) {
    this.account = account;
  }

  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public BigInteger getBalance() {
    return balance;
  }

  public void setBalance(BigInteger balance) {
    this.balance = balance;
  }

  public BigInteger getUnlockedBalance() {
    return unlockedBalance;
  }

  public void setUnlockedBalance(BigInteger unlockedBalance) {
    this.unlockedBalance = unlockedBalance;
  }

  public Integer getNumUnspentOutputs() {
    return numUnspentOutputs;
  }

  public void setNumUnspentOutputs(Integer numUnspentOutputs) {
    this.numUnspentOutputs = numUnspentOutputs;
  }

  public Boolean getIsUsed() {
    return isUsed;
  }

  public void setIsUsed(Boolean isUsed) {
    this.isUsed = isUsed;
  }
  
  public void merge(MoneroSubaddress subaddress) {
    if (account == null) account = subaddress.getAccount();
    else if (subaddress.getAccount() != null) account.merge(subaddress.getAccount());
    if (index == null) index = subaddress.getIndex();
    else if (subaddress.getIndex() != null) assertEquals(index, subaddress.getIndex());
    if (label == null) label = subaddress.getLabel();
    else if (subaddress.getLabel() != null) assertEquals(label, subaddress.getLabel());
    if (address == null) address = subaddress.getAddress();
    else if (subaddress.getAddress() != null) assertEquals(address, subaddress.getAddress());
    if (balance == null) balance = subaddress.getBalance();
    else if (subaddress.getBalance() != null) assertEquals(balance, subaddress.getBalance());
    if (unlockedBalance == null) unlockedBalance = subaddress.getUnlockedBalance();
    else if (subaddress.getUnlockedBalance() != null) assertEquals(unlockedBalance, subaddress.getUnlockedBalance());
    if (numUnspentOutputs == null) numUnspentOutputs = subaddress.getNumUnspentOutputs();
    else if (subaddress.getNumUnspentOutputs() != null) assertEquals(numUnspentOutputs, subaddress.getNumUnspentOutputs());
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("index: [" + account.getIndex() + ", " + index + "]\n");
    sb.append("label: " + label + "\n");
    sb.append("address: " + address + "\n");
    sb.append("balance: " + balance + "\n");
    sb.append("unlockedBalance: " + unlockedBalance + "\n");
    sb.append("numUnspentOutputs: " + numUnspentOutputs + "\n");
    return sb.toString();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((account == null) ? 0 : account.hashCode());
    result = prime * result + ((address == null) ? 0 : address.hashCode());
    result = prime * result + ((balance == null) ? 0 : balance.hashCode());
    result = prime * result + ((index == null) ? 0 : index.hashCode());
    result = prime * result + ((isUsed == null) ? 0 : isUsed.hashCode());
    result = prime * result + ((label == null) ? 0 : label.hashCode());
    result = prime * result + ((numUnspentOutputs == null) ? 0 : numUnspentOutputs.hashCode());
    result = prime * result + ((unlockedBalance == null) ? 0 : unlockedBalance.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    MoneroSubaddress other = (MoneroSubaddress) obj;
    if (account == null) {
      if (other.account != null) return false;
    } else if (!account.equals(other.account)) return false;
    if (address == null) {
      if (other.address != null) return false;
    } else if (!address.equals(other.address)) return false;
    if (balance == null) {
      if (other.balance != null) return false;
    } else if (!balance.equals(other.balance)) return false;
    if (index == null) {
      if (other.index != null) return false;
    } else if (!index.equals(other.index)) return false;
    if (isUsed == null) {
      if (other.isUsed != null) return false;
    } else if (!isUsed.equals(other.isUsed)) return false;
    if (label == null) {
      if (other.label != null) return false;
    } else if (!label.equals(other.label)) return false;
    if (numUnspentOutputs == null) {
      if (other.numUnspentOutputs != null) return false;
    } else if (!numUnspentOutputs.equals(other.numUnspentOutputs)) return false;
    if (unlockedBalance == null) {
      if (other.unlockedBalance != null) return false;
    } else if (!unlockedBalance.equals(other.unlockedBalance)) return false;
    return true;
  }
}
