package dao;

import java.util.List;

import vo.Post;

public interface PostDAO {
	void insertAll(String email, String msg, String video, String img);
	List<Post>selectByEmail(String email);
	List<Post>selectByFriend(String friend_no);
}
