.class final Lbsv;
.super Lbun;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic g:Ljava/lang/String;


# direct methods
.method constructor <init>(Lbsu;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p3, p0, Lbsv;->a:Ljava/lang/String;

    iput-object p4, p0, Lbsv;->g:Ljava/lang/String;

    invoke-direct {p0, p2}, Lbun;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method protected final synthetic a(Lbwc;)V
    .locals 6

    .prologue
    .line 0
    check-cast p1, Lbue;

    .line 1000
    :try_start_0
    iget-object v1, p0, Lbsv;->a:Ljava/lang/String;

    iget-object v2, p0, Lbsv;->g:Ljava/lang/String;

    .line 2000
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The message payload cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 1000
    :catch_0
    move-exception v0

    :goto_0
    const/16 v0, 0x7d1

    invoke-virtual {p0, v0}, Lbsv;->a(I)V

    .line 0
    :goto_1
    return-void

    .line 2000
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/high16 v3, 0x10000

    if-le v0, v3, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Message exceeds maximum size"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1000
    :catch_1
    move-exception v0

    goto :goto_0

    .line 2000
    :cond_1
    invoke-static {v1}, La;->d(Ljava/lang/String;)V

    invoke-virtual {p1}, Lbue;->f()V

    iget-object v0, p1, Lbue;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-wide v4

    :try_start_2
    iget-object v0, p1, Lbue;->f:Ljava/util/Map;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v0, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lbue;->o()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lbuo;

    invoke-interface {v0, v1, v2, v4, v5}, Lbuo;->a(Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_2
    move-exception v0

    :try_start_3
    iget-object v1, p1, Lbue;->f:Ljava/util/Map;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
.end method
