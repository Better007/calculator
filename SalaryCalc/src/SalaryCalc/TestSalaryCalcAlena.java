package SalaryCalc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;

import org.junit.Test;

public class TestSalaryCalcAlena {
    
    
    @Test
    public void testCalcSalary(){
        try{
            //Установка начальных значений для теста
            SalaryCalc sc = new SalaryCalc();
            sc.arrTf[0].setText("130");
            sc.arrTf[1].setText("8");
            sc.arrTf[2].setText("31");
            sc.arrTf[3].setText("11");
            //вызов метода расчета зарплаты
            sc.calcSalary();
            //если расчетная ЗП совпадает с указанной, значит метод считает правильно и тест пройдет
            Assert.assertTrue("31562,96".equals(sc.arrTf[7].getText()));
        }catch(Exception e){
            //У случае возникновения ошибки, тест будет провален и в консоль будет выведено сообщение:
            Assert.fail("Проверьте правильность входных занчений");
        }
        
    }
}

