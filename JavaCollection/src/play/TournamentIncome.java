/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package play;

/**
 *
 * @author Admin
 */
public class TournamentIncome extends Player implements GradeBonus{
  private int numberOfMatches;
  private double mark;

    public TournamentIncome() {
    }
    public TournamentIncome(int numberOfMatches, double mark) {
        this.numberOfMatches = numberOfMatches;
        this.mark = mark;
    }
    @Override
    String displayDetails() {
        return "name ="+ this.name +"income = "+ ;
                }
//<= n*100*0.3 điểm: hạng D
//> n*100*0.3 và <= n*100*0.4: hạng C
//> n*100*0.4 và <= n*100*0.5: hạng B
//> n*100*0.5: hạng A

    @Override
    public double calculateGradeBonus() {
        if(this.mark<=this.numberOfMatches*100*0.3){
            return GRADE_D_BONUS_PERCENT;
        }else if(this.mark<=this.numberOfMatches*100*0.4){
            return GRADE_C_BONUS_PERCENT;
    }else if(this.mark<=this.numberOfMatches*100*0.5){
            return GRADE_B_BONUS_PERCENT;
    }else return GRADE_A_BONUS_PERCENT;
    }
}
