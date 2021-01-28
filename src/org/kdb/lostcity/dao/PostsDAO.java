package org.kdb.lostcity.dao;

import java.util.List;
import java.util.Map;


import org.kdb.lostcity.vo.Post;

public interface PostsDAO {
	public List<Post> selectList(Map<String,Object> map);
	public int selectTotal(Map<String,Object> map);
	public Post selectOne(int no);
	
}