package org.example.quanlyoto;

import org.example.dao.XeOToDAO;
import org.example.model.HangXe;
import org.example.model.XeOTo;

import java.util.List;
import java.util.Scanner;

public class XeOToService {

    private XeOToDAO dao = new XeOToDAO();
    private HangXeService hangXeService = new HangXeService();

    public void them() {
        List<HangXe> dsHang = hangXeService.getAll();

        if (dsHang.isEmpty()) {
            System.out.println("Chua co hang xe!");
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Chon hang xe:");
        for (int i = 0; i < dsHang.size(); i++) {
            System.out.println(i + ". " + dsHang.get(i).getTenHang());
        }

        int choice = sc.nextInt();
        sc.nextLine();

        HangXe hx = dsHang.get(choice);

        XeOTo xe = new XeOTo();
        xe.nhap(hx);

        dao.insert(xe);
    }

    public void hienThi() {
        List<XeOTo> list = dao.getAll();
        for (XeOTo xe : list) {
            xe.xuat();
        }
    }
}