package com.example.factory;

import android.content.res.Resources;

import com.example.object.BigPlane;
import com.example.object.BossBullet;
import com.example.object.BossPlane;
import com.example.object.MyBullet;
import com.example.object.BulletGoods;
import com.example.object.GameObject;
import com.example.object.MiddlePlane;
import com.example.object.MissileGoods;
import com.example.object.MyBullet2;
import com.example.object.MyPlane;
import com.example.object.SmallPlane;
/*��Ϸ����Ĺ�����*/
public class GameObjectFactory {
	//����С�͵л��ķ���
	public GameObject createSmallPlane(Resources resources){
		return new SmallPlane(resources);
	}
	//�������͵л��ķ���
	public GameObject createMiddlePlane(Resources resources){
		return new MiddlePlane(resources);
	}
	//�������͵л��ķ���
	public GameObject createBigPlane(Resources resources){
		return new BigPlane(resources);
	}
	//����BOSS�л��ķ���
	public GameObject createBossPlane(Resources resources){
		return new BossPlane(resources);
	}
	//������ҷɻ��ķ���
	public GameObject createMyPlane(Resources resources){
		return new MyPlane(resources);
	}
	//��������ӵ�
	public GameObject createMyBullet(Resources resources){
		return new MyBullet(resources);
	}
	//��������ӵ�
	public GameObject createMyBullet2(Resources resources){
		return new MyBullet2(resources);
	}
	//����BOSS�ӵ�
	public GameObject createBossBullet(Resources resources){
		return new BossBullet(resources);
	}
	//����������Ʒ
	public GameObject createMissileGoods(Resources resources){
		return new MissileGoods(resources);
	}
	//�����ӵ���Ʒ
	public GameObject createBulletGoods(Resources resources){
		return new BulletGoods(resources);
	}
}
