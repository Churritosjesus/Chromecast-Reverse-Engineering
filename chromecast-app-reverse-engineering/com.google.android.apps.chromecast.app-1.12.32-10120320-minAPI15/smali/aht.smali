.class final Laht;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field private a:Ljava/util/List;

.field private b:Ljava/util/List;

.field private c:I

.field private d:Lahx;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lahx;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1149
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Laht;->a:Ljava/util/List;

    .line 1150
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Laht;->b:Ljava/util/List;

    .line 1166
    iput-object p1, p0, Laht;->d:Lahx;

    .line 1168
    iput-object p3, p0, Laht;->e:Ljava/lang/String;

    .line 1169
    return-void
.end method

.method private static a(Ljava/lang/String;)[B
    .locals 3

    .prologue
    .line 1273
    const/4 v0, 0x0

    .line 1275
    :try_start_0
    const-string v1, "UTF-8"

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 1280
    :goto_0
    return-object v0

    .line 1276
    :catch_0
    move-exception v1

    .line 1278
    const-string v2, "Encoding exception: "

    invoke-static {v2, v1}, Laji;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method


# virtual methods
.method public final declared-synchronized a()I
    .locals 1

    .prologue
    .line 1182
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Laht;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Laga;ZZ)I
    .locals 6

    .prologue
    .line 1198
    monitor-enter p0

    .line 1199
    :try_start_0
    iget v1, p0, Laht;->c:I

    .line 1202
    iget-object v0, p0, Laht;->b:Ljava/util/List;

    iget-object v2, p0, Laht;->a:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1203
    iget-object v0, p0, Laht;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1205
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 1206
    iget-object v0, p0, Laht;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lahm;

    .line 1207
    if-nez p2, :cond_1

    .line 2367
    iget-boolean v4, v0, Lahm;->b:Z

    .line 1207
    if-nez v4, :cond_0

    .line 2371
    :cond_1
    iget-object v0, v0, Lahm;->a:Lorg/json/JSONObject;

    .line 1208
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 1215
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 1212
    :cond_2
    :try_start_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-nez v0, :cond_3

    .line 1213
    const/4 v0, 0x0

    monitor-exit p0

    .line 1218
    :goto_1
    return v0

    .line 1215
    :cond_3
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3241
    :try_start_2
    sget-object v0, Lahw;->b:Lahw;

    iget-object v3, p0, Laht;->d:Lahx;

    iget-object v4, p0, Laht;->e:Ljava/lang/String;

    .line 3246
    invoke-static {}, Lahe;->e()Landroid/content/Context;

    move-result-object v5

    .line 3241
    invoke-static {v0, v3, v4, p3, v5}, Lahu;->a(Lahw;Lahx;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v0

    .line 3248
    iget v3, p0, Laht;->c:I

    if-lez v3, :cond_4

    .line 3249
    const-string v3, "num_skipped_events"

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    .line 3676
    :cond_4
    :goto_2
    iput-object v0, p1, Laga;->c:Lorg/json/JSONObject;

    .line 3751
    iget-object v0, p1, Laga;->d:Landroid/os/Bundle;

    .line 3258
    if-nez v0, :cond_5

    .line 3259
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 3262
    :cond_5
    invoke-virtual {v2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v1

    .line 3263
    if-eqz v1, :cond_6

    .line 3264
    const-string v3, "custom_events_file"

    .line 3266
    invoke-static {v1}, Laht;->a(Ljava/lang/String;)[B

    move-result-object v4

    .line 3264
    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 3946
    iput-object v1, p1, Laga;->f:Ljava/lang/Object;

    .line 4760
    :cond_6
    iput-object v0, p1, Laga;->d:Landroid/os/Bundle;

    .line 1218
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    goto :goto_1

    .line 3253
    :catch_0
    move-exception v0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    goto :goto_2
.end method

.method public final declared-synchronized a(Lahm;)V
    .locals 2

    .prologue
    .line 1174
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Laht;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Laht;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    const/16 v1, 0x3e8

    if-lt v0, v1, :cond_0

    .line 1175
    iget v0, p0, Laht;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Laht;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1179
    :goto_0
    monitor-exit p0

    return-void

    .line 1177
    :cond_0
    :try_start_1
    iget-object v0, p0, Laht;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1174
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Ljava/util/List;)V
    .locals 1

    .prologue
    .line 1234
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Laht;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1235
    monitor-exit p0

    return-void

    .line 1234
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized a(Z)V
    .locals 2

    .prologue
    .line 1186
    monitor-enter p0

    if-eqz p1, :cond_0

    .line 1187
    :try_start_0
    iget-object v0, p0, Laht;->a:Ljava/util/List;

    iget-object v1, p0, Laht;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1189
    :cond_0
    iget-object v0, p0, Laht;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1190
    const/4 v0, 0x0

    iput v0, p0, Laht;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1191
    monitor-exit p0

    return-void

    .line 1186
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized b()Ljava/util/List;
    .locals 2

    .prologue
    .line 1225
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Laht;->a:Ljava/util/List;

    .line 1226
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Laht;->a:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1227
    monitor-exit p0

    return-object v0

    .line 1225
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
