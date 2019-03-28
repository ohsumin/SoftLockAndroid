package com.kosmo.model;

public class TreattimeDTO {
   private int treat_idx;
   private int treat_hp_idx;
   private String treat_dy;
   private String treat_open;
   private String treat_close;
   
   public TreattimeDTO() {

   }
   
   public TreattimeDTO(int treat_idx, int treat_hp_idx, String treat_dy, String treat_open, String treat_close) {
      super();
      this.treat_idx = treat_idx;
      this.treat_hp_idx = treat_hp_idx;
      this.treat_dy = treat_dy;
      this.treat_open = treat_open;
      this.treat_close = treat_close;
   }

   public int getTreat_idx() {
      return treat_idx;
   }

   public void setTreat_idx(int treat_idx) {
      this.treat_idx = treat_idx;
   }

   public int getTreat_hp_idx() {
      return treat_hp_idx;
   }

   public void setTreat_hp_idx(int treat_hp_idx) {
      this.treat_hp_idx = treat_hp_idx;
   }

   public String getTreat_dy() {
      return treat_dy;
   }

   public void setTreat_dy(String treat_dy) {
      this.treat_dy = treat_dy;
   }

   public String getTreat_open() {
      return treat_open;
   }

   public void setTreat_open(String treat_open) {
      this.treat_open = treat_open;
   }

   public String getTreat_close() {
      return treat_close;
   }

   public void setTreat_close(String treat_close) {
      this.treat_close = treat_close;
   }
   
   
   

}