package com.example.sounds;

import java.util.HashMap;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import com.example.mybeatplane.MainActivity;
import com.example.mybeatplane.R;

public class GameSoundPool {
	private MainActivity mainActivity;
	private SoundPool soundPool;
	private HashMap<Integer,Integer> map;
	public GameSoundPool(MainActivity mainActivity){
		this.mainActivity = mainActivity;
		map = new HashMap<Integer,Integer>();
		soundPool = new SoundPool(8,AudioManager.STREAM_MUSIC,0);
	}
	public void initGameSound(){
		map.put(1, soundPool.load(mainActivity, R.raw.shoot, 1));
		map.put(2, soundPool.load(mainActivity, R.raw.explosion, 1));
		map.put(3, soundPool.load(mainActivity, R.raw.explosion2, 1));
		map.put(4, soundPool.load(mainActivity, R.raw.explosion3, 1));
		map.put(5, soundPool.load(mainActivity, R.raw.bigexplosion, 1));
		map.put(6, soundPool.load(mainActivity, R.raw.get_goods, 1));
		map.put(7, soundPool.load(mainActivity, R.raw.button, 1));
	}
	//播放音效
	public void playSound(int sound,int loop){
		AudioManager am = (AudioManager)mainActivity.getSystemService(Context.AUDIO_SERVICE);
		float stramVolumeCurrent = am.getStreamVolume(AudioManager.STREAM_MUSIC);
		float stramMaxVolumeCurrent = am.getStreamVolume(AudioManager.STREAM_MUSIC);
		float volume = stramVolumeCurrent/stramMaxVolumeCurrent;
		
//        priority —— 流的优先级，值越大优先级高，影响当同时播放数量超出了最大支持数时SoundPool对该流的处理；
//        loop —— 循环播放的次数，0为值播放一次，-1为无限循环，其他值为播放loop+1次（例如，3为一共播放4次）.
//        rate —— 播放的速率，范围0.5-2.0(0.5为一半速率，1.0为正常速率，2.0为两倍速率)
		soundPool.play(map.get(sound), volume, volume, 1, loop, 1.0f);	
	}
}
