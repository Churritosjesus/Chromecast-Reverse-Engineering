.class public abstract Lbfd;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final c:I


# instance fields
.field private final a:Lblp;

.field d:Lbfq;

.field final e:Ljava/lang/Object;

.field public f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 30
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lbfd;->c:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lbfd;->e:Ljava/lang/Object;

    .line 100
    new-instance v0, Lblp;

    const-string v1, "NetworkRequest"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lbfd;->a:Lblp;

    .line 101
    return-void
.end method

.method private static a(I)Lbfq;
    .locals 2

    .prologue
    .line 255
    new-instance v0, Lbfr;

    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->a()Lcom/google/android/apps/chromecast/app/SetupApplication;

    move-result-object v1

    .line 2185
    iget-object v1, v1, Lcom/google/android/apps/chromecast/app/SetupApplication;->i:Landroid/net/http/AndroidHttpClient;

    .line 255
    invoke-direct {v0, v1, p0, p0}, Lbfr;-><init>(Landroid/net/http/AndroidHttpClient;II)V

    return-object v0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public final a(Landroid/net/Uri;I)Lbfq;
    .locals 1

    .prologue
    .line 144
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lbfd;->a(Landroid/net/Uri;Ljava/util/Map;I)Lbfq;

    move-result-object v0

    return-object v0
.end method

.method protected final a(Landroid/net/Uri;Lbfc;I)Lbfq;
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 190
    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    .line 191
    invoke-static {p3}, Lbfd;->a(I)Lbfq;

    move-result-object v0

    .line 192
    const-string v1, "Origin"

    const-string v2, "https://www.google.com"

    invoke-interface {v0, v1, v2}, Lbfq;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    :try_start_0
    iget-object v1, p0, Lbfd;->e:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 195
    :try_start_1
    iput-object v0, p0, Lbfd;->d:Lbfq;

    .line 196
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 197
    :try_start_2
    invoke-interface {v0, p1, p2}, Lbfq;->a(Landroid/net/Uri;Lbfc;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 205
    iget-object v1, p0, Lbfd;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 206
    const/4 v2, 0x0

    :try_start_3
    iput-object v2, p0, Lbfd;->d:Lbfq;

    .line 207
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 209
    return-object v0

    .line 196
    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 198
    :catch_0
    move-exception v0

    .line 199
    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 200
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 205
    :catchall_1
    move-exception v0

    iget-object v1, p0, Lbfd;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 206
    const/4 v2, 0x0

    :try_start_7
    iput-object v2, p0, Lbfd;->d:Lbfq;

    .line 207
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0

    :catchall_2
    move-exception v0

    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v0

    .line 201
    :catch_1
    move-exception v0

    .line 202
    const/4 v1, 0x1

    :try_start_9
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 203
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 207
    :catchall_3
    move-exception v0

    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    throw v0
.end method

.method protected final a(Landroid/net/Uri;Ljava/util/Map;I)Lbfq;
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 157
    new-array v0, v0, [Ljava/lang/Object;

    aput-object p1, v0, v1

    .line 158
    invoke-static {p3}, Lbfd;->a(I)Lbfq;

    move-result-object v2

    .line 159
    const-string v0, "Origin"

    const-string v1, "https://www.google.com"

    invoke-interface {v2, v0, v1}, Lbfq;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1244
    if-eqz p2, :cond_0

    .line 1247
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1248
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v2, v0, v1}, Lbfq;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 162
    :cond_0
    :try_start_0
    iget-object v1, p0, Lbfd;->e:Ljava/lang/Object;

    monitor-enter v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 163
    :try_start_1
    iput-object v2, p0, Lbfd;->d:Lbfq;

    .line 164
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    :try_start_2
    invoke-interface {v2, p1}, Lbfq;->a(Landroid/net/Uri;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 173
    iget-object v1, p0, Lbfd;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 174
    const/4 v0, 0x0

    :try_start_3
    iput-object v0, p0, Lbfd;->d:Lbfq;

    .line 175
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 177
    return-object v2

    .line 164
    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 166
    :catch_0
    move-exception v0

    .line 167
    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 168
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 173
    :catchall_1
    move-exception v0

    iget-object v1, p0, Lbfd;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 174
    const/4 v2, 0x0

    :try_start_7
    iput-object v2, p0, Lbfd;->d:Lbfq;

    .line 175
    monitor-exit v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0

    :catchall_2
    move-exception v0

    :try_start_8
    monitor-exit v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    throw v0

    .line 169
    :catch_1
    move-exception v0

    .line 170
    const/4 v1, 0x1

    :try_start_9
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    .line 171
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 175
    :catchall_3
    move-exception v0

    :try_start_a
    monitor-exit v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    throw v0
.end method
