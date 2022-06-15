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
public interface  GradeBonus {
    double GRADE_A_BONUS_PERCENT=0.3;
    double GRADE_B_BONUS_PERCENT=0.2;
    double GRADE_C_BONUS_PERCENT=0.15;
    double GRADE_D_BONUS_PERCENT=0.1;
    abstract double calculateGradeBonus();
}
