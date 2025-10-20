package service.impl;

import dao.impl.SorderDaoImpl;
import model.Sorder;
import service.SorderService;

public class SorderServiceImpl implements SorderService{

	public static void main(String[] args) {
		Sorder o=new Sorder("haveaniceday", 22, 2, 1, 3);
		System.out.println(new SorderServiceImpl().addSorder(o));
	}

	private SorderDaoImpl sdi=new SorderDaoImpl();
	
	@Override
	public int addSorder(Sorder Sorder) {
		sdi.insert(Sorder);
		return 0;
	}
}
