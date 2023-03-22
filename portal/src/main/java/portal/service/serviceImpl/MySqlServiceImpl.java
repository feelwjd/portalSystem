package portal.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import portal.dao.MySqlDao;
import portal.service.MySqlService;

@Service
public class MySqlServiceImpl implements MySqlService {
	
	@Autowired
    private final MySqlDao mySqlDao;

    public MySqlServiceImpl(MySqlDao mySqlDao) {
        this.mySqlDao = mySqlDao;
    }

    @Override
    public List<Map<String, Object>> selectMessageBackbon() {
        return mySqlDao.selectMessageBackbon();
    }
}