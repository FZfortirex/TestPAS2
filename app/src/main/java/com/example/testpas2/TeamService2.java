package com.example.testpas2;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TeamService2 {
    @GET("search_all_teams.php?s=Soccer&c=Spain")
    Call<TeamResponse> getTeams();
}