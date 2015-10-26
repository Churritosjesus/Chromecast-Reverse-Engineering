.class public final Lbfn;
.super Lbfp;
.source "PG"


# static fields
.field private static final b:I


# instance fields
.field public a:Ljava/lang/String;

.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 22
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x28

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-int v0, v0

    sput v0, Lbfn;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Lbfp;-><init>(Ljava/lang/String;)V

    .line 29
    iput-object p2, p0, Lbfn;->j:Ljava/lang/String;

    .line 30
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 4

    .prologue
    const/4 v0, -0x3

    .line 35
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 38
    :try_start_0
    const-string v2, "uuid"

    iget-object v3, p0, Lbfn;->j:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_3

    .line 42
    :goto_0
    :try_start_1
    const-string v2, "send_log_report"

    .line 43
    invoke-static {v1}, Lbfc;->a(Lorg/json/JSONObject;)Lbfc;

    move-result-object v1

    sget v3, Lbfn;->b:I

    .line 42
    invoke-virtual {p0, v2, v1, v3}, Lbfn;->a(Ljava/lang/String;Lbfc;I)Lbfq;

    move-result-object v1

    .line 44
    invoke-interface {v1}, Lbfq;->c()Lbfc;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    .line 52
    if-eqz v1, :cond_0

    const-string v2, "application/json"

    .line 1092
    iget-object v3, v1, Lbfc;->b:Ljava/lang/String;

    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 65
    :cond_0
    :goto_1
    return v0

    .line 46
    :catch_0
    move-exception v0

    const/4 v0, -0x1

    goto :goto_1

    .line 48
    :catch_1
    move-exception v0

    const/4 v0, -0x2

    goto :goto_1

    .line 55
    :cond_1
    invoke-virtual {v1}, Lbfc;->a()Ljava/lang/String;

    move-result-object v1

    .line 56
    if-eqz v1, :cond_0

    .line 61
    :try_start_2
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 62
    const-string v1, "crash_report_id"

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lbfn;->a:Ljava/lang/String;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 63
    const/4 v0, 0x0

    goto :goto_1

    .line 65
    :catch_2
    move-exception v1

    goto :goto_1

    :catch_3
    move-exception v2

    goto :goto_0
.end method
