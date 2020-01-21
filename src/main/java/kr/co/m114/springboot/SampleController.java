package kr.co.m114.springboot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SampleController
 */
@RestController
public class SampleController {
  @Autowired
  SampleService svc;

  @GetMapping("list")
  public Map<?, ?> getList() {
    Map<String, Object> result = new HashMap<>();
    List<SampleModel> list = svc.getList();
    result.put("list", list);
    return result;
  }
}