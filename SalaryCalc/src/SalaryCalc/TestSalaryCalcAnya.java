package SalaryCalc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;

import org.junit.Test;

public class TestSalaryCalcAnya {
    
    
    @Test
    public void testCalcSalary(){
        try{
            //��������� ��������� �������� ��� �����
            SalaryCalc sc = new SalaryCalc();
            sc.arrTf[0].setText("120");
            sc.arrTf[1].setText("7");
            sc.arrTf[2].setText("35");
            sc.arrTf[3].setText("10");
            //����� ������ ������� ��������
            sc.calcSalary();
            //���� ��������� �� ��������� � ���������, ������ ����� ������� ��������� � ���� �������
            Assert.assertTrue("29106,00".equals(sc.arrTf[7].getText()));
        }catch(Exception e){
            //� ������ ������������� ������, ���� ����� �������� � � ������� ����� �������� ���������:
            Assert.fail("��������� ������������ ������� ��������");
        }
        
    }
}
