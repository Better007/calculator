package SalaryCalc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;

import org.junit.Test;

public class TestSalaryCalcDi {
    
    
    @Test
    public void testCalcSalary(){
        try{
            //��������� ��������� �������� ��� �����
            SalaryCalc sc = new SalaryCalc();
            sc.arrTf[0].setText("110");
            sc.arrTf[1].setText("10");
            sc.arrTf[2].setText("25");
            sc.arrTf[3].setText("15");
            //����� ������ ������� ��������
            sc.calcSalary();
            //���� ��������� �� ��������� � ���������, ������ ����� ������� ��������� � ���� �������
            Assert.assertTrue("25712,50".equals(sc.arrTf[7].getText()));
        }catch(Exception e){
            //� ������ ������������� ������, ���� ����� �������� � � ������� ����� �������� ���������:
            Assert.fail("��������� ������������ ������� ��������");
        }
        
    }
}
