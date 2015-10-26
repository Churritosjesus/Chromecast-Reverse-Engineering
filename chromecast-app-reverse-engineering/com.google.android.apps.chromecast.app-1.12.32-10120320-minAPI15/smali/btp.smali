.class public final Lbtp;
.super Lbtu;


# instance fields
.field private synthetic g:Lcom/google/android/gms/common/api/GoogleApiClient;

.field private synthetic h:Lorg/json/JSONObject;

.field private synthetic i:Lbtl;


# direct methods
.method public constructor <init>(Lbtl;Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/common/api/GoogleApiClient;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lbtp;->i:Lbtl;

    iput-object p3, p0, Lbtp;->g:Lcom/google/android/gms/common/api/GoogleApiClient;

    iput-object p4, p0, Lbtp;->h:Lorg/json/JSONObject;

    invoke-direct {p0, p2}, Lbtu;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lbwc;)V
    .locals 4

    .prologue
    .line 0
    .line 1000
    iget-object v0, p0, Lbtp;->i:Lbtl;

    .line 2000
    iget-object v1, v0, Lbtl;->a:Ljava/lang/Object;

    .line 1000
    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lbtp;->i:Lbtl;

    .line 3000
    iget-object v0, v0, Lbtl;->c:Lbts;

    .line 1000
    iget-object v2, p0, Lbtp;->g:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 4000
    iput-object v2, v0, Lbts;->a:Lcom/google/android/gms/common/api/GoogleApiClient;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1000
    :try_start_1
    iget-object v0, p0, Lbtp;->i:Lbtl;

    .line 5000
    iget-object v0, v0, Lbtl;->b:Lbuv;

    .line 1000
    iget-object v2, p0, Lbtp;->a:Lbux;

    iget-object v3, p0, Lbtp;->h:Lorg/json/JSONObject;

    invoke-virtual {v0, v2, v3}, Lbuv;->b(Lbux;Lorg/json/JSONObject;)J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v0, p0, Lbtp;->i:Lbtl;

    .line 6000
    iget-object v0, v0, Lbtl;->c:Lbts;

    .line 1000
    const/4 v2, 0x0

    .line 7000
    iput-object v2, v0, Lbts;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 1000
    :goto_0
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catch_0
    move-exception v0

    :try_start_3
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x834

    invoke-direct {v0, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p0, v0}, Lbtp;->b(Lcom/google/android/gms/common/api/Status;)Lbb;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbtp;->a(Lbwm;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    iget-object v0, p0, Lbtp;->i:Lbtl;

    .line 8000
    iget-object v0, v0, Lbtl;->c:Lbts;

    .line 1000
    const/4 v2, 0x0

    .line 9000
    iput-object v2, v0, Lbts;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    goto :goto_0

    .line 1000
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    :try_start_5
    iget-object v2, p0, Lbtp;->i:Lbtl;

    .line 10000
    iget-object v2, v2, Lbtl;->c:Lbts;

    .line 1000
    const/4 v3, 0x0

    .line 11000
    iput-object v3, v2, Lbts;->a:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 1000
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method
