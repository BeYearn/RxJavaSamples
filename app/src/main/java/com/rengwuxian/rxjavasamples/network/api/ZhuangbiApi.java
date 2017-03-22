// (c)2016 Flipboard Inc, All Rights Reserved.

package com.rengwuxian.rxjavasamples.network.api;

import com.rengwuxian.rxjavasamples.model.ZhuangbiImage;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ZhuangbiApi {
    @GET("search")    // 改成POST也行
    Observable<List<ZhuangbiImage>> search(@Query("q") String key);   //https://www.zhuangbi.info/search?q=在下   q是参数名字
}
