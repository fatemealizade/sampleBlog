package com.example.sampleblog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sampleblog.adapters.PostAdapter;
import com.example.sampleblog.models.Post;
import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;

public class MainActivity extends AppCompatActivity {

    private Post[] mPosts;
    OkHttpClient client = new OkHttpClient();
    public String url = "https://jsonplaceholder.typicode.com/posts";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String posts = "[ {\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 1,\n" +
                "    \"title\": \"sSSSSSunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
                "    \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 2,\n" +
                "    \"title\": \"qui est esse\",\n" +
                "    \"body\": \"est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 3,\n" +
                "    \"title\": \"ea molestias quasi exercitationem repellat qui ipsa sit aut\",\n" +
                "    \"body\": \"et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut ad\\nvoluptatem doloribus vel accusantium quis pariatur\\nmolestiae porro eius odio et labore et velit aut\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 4,\n" +
                "    \"title\": \"eum et est occaecati\",\n" +
                "    \"body\": \"ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"userId\": 1,\n" +
                "    \"id\": 5,\n" +
                "    \"title\": \"nesciunt quas odio\",\n" +
                "    \"body\": \"repudiandae veniam quaerat sunt sed\\nalias aut fugiat sit autem sed est\\nvoluptatem omnis possimus esse voluptatibus quis\\nest aut tenetur dolor neque\"\n" +
                "  } ]";
        Gson gson = new Gson();
        mPosts = gson.fromJson(posts,Post[].class);


//        mPosts = new Post[]{
//                new Post() {{
//                    id = 1;
//                    userId = 1;
//                    title = "sunt aut facere repellat provident occaecati excepturi optio reprehenderit";
//                    body = "quia et suscipit\\\\nsuscipit recusandae consequuntur expedita et cum\\\\nreprehenderit molestiae ut ut quas totam\\\\nnostrum rerum est autem sunt rem eveniet architecto";
//                }},
//                new Post() {{
//                    id = 1;
//                    userId = 2;
//                    title = "qui est esse";
//                    body = "est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla";
//                }},
//                new Post() {{
//                    id = 1;
//                    userId = 3;
//                    title = "ea molestias quasi exercitationem repellat qui ipsa sit aut";
//                    body = "et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut ad\\nvoluptatem doloribus vel accusantium quis pariatur\\nmolestiae porro eius odio et labore et velit aut";
//                }},
//                new Post() {{
//                    id = 1;
//                    userId = 4;
//                    title = "eum et est occaecati";
//                    body ="ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit";
//                }},
//                new Post() {{
//                    id = 1;
//                    userId = 4;
//                    title = "eum et est occaecati";
//                    body ="ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit";
//                }},
//                new Post() {{
//                    id = 1;
//                    userId = 4;
//                    title = "eum et est occaecati";
//                    body ="ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit";
//                }},
//                new Post() {{
//                    id = 1;
//                    userId = 4;
//                    title = "eum et est occaecati";
//                    body ="ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit";
//                }},
//                new Post() {{
//                    id = 1;
//                    userId = 4;
//                    title = "eum et est occaecati";
//                    body ="ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit";
//                }},
//                new Post() {{
//                    id = 1;
//                    userId = 4;
//                    title = "eum et est occaecati";
//                    body ="ullam et saepe reiciendis voluptatem adipisci\\nsit amet autem assumenda provident rerum culpa\\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\\nquis sunt voluptatem rerum illo velit";
//                }},
//        };

        ListView results = findViewById(R.id.posts_list);
        results.setAdapter(new PostAdapter(this, mPosts));

//        posts = new Post[]{
//                new Post(1,
//                        1,
//                        "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
//                        "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto"),
//        };

//        posts = new Post[5];
//        posts[0] = new Post();
//        posts[0].id = 1;
//        posts[0].userId = 1;
//        posts[0].title = "sunt aut facere repellat provident occaecati excepturi optio reprehenderit";
//        posts[0].body = "quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto";


    }


}
