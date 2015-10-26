.class public final Lbqd;
.super Ljava/lang/Object;


# static fields
.field public static A:Lbqe;

.field public static B:Lbqe;

.field public static C:Lbqe;

.field public static D:Lbqe;

.field public static E:Lbqe;

.field public static a:Lbqe;

.field public static b:Lbqe;

.field public static c:Lbqe;

.field public static d:Lbqe;

.field public static e:Lbqe;

.field public static f:Lbqe;

.field public static g:Lbqe;

.field public static h:Lbqe;

.field public static i:Lbqe;

.field public static j:Lbqe;

.field public static k:Lbqe;

.field public static l:Lbqe;

.field public static m:Lbqe;

.field public static n:Lbqe;

.field public static o:Lbqe;

.field public static p:Lbqe;

.field public static q:Lbqe;

.field public static r:Lbqe;

.field public static s:Lbqe;

.field public static t:Lbqe;

.field public static u:Lbqe;

.field public static v:Lbqe;

.field public static w:Lbqe;

.field public static x:Lbqe;

.field public static y:Lbqe;

.field public static z:Lbqe;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .prologue
    const-wide/32 v12, 0x5265c00

    const/16 v10, 0x2000

    const/16 v9, 0x14

    const/4 v8, 0x0

    const-wide/16 v6, 0x1388

    .line 0
    const-string v0, "analytics.service_enabled"

    invoke-static {v0, v8}, Lbqe;->a(Ljava/lang/String;Z)Lbqe;

    const-string v0, "analytics.service_client_enabled"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lbqe;->a(Ljava/lang/String;Z)Lbqe;

    move-result-object v0

    sput-object v0, Lbqd;->a:Lbqe;

    const-string v0, "analytics.log_tag"

    const-string v1, "GAv4"

    const-string v2, "GAv4-SVC"

    invoke-static {v0, v1, v2}, Lbqe;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbqe;

    move-result-object v0

    sput-object v0, Lbqd;->b:Lbqe;

    const-string v0, "analytics.max_tokens"

    const-wide/16 v2, 0x3c

    .line 1000
    invoke-static {v0, v2, v3, v2, v3}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    .line 0
    const-string v0, "analytics.tokens_per_sec"

    .line 2000
    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f000000    # 0.5f

    .line 3000
    new-instance v3, Lbqe;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v0, v2}, Lcks;->a(Ljava/lang/String;Ljava/lang/Float;)Lcks;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Lbqe;-><init>(Lcks;Ljava/lang/Object;)V

    .line 0
    const-string v0, "analytics.max_stored_hits"

    const/16 v1, 0x7d0

    const/16 v2, 0x4e20

    invoke-static {v0, v1, v2}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    move-result-object v0

    sput-object v0, Lbqd;->c:Lbqe;

    const-string v0, "analytics.max_stored_hits_per_app"

    const/16 v1, 0x7d0

    .line 4000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    .line 0
    const-string v0, "analytics.max_stored_properties_per_app"

    const/16 v1, 0x64

    .line 5000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->d:Lbqe;

    const-string v0, "analytics.local_dispatch_millis"

    const-wide/32 v2, 0x1b7740

    const-wide/32 v4, 0x1d4c0

    invoke-static {v0, v2, v3, v4, v5}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    move-result-object v0

    sput-object v0, Lbqd;->e:Lbqe;

    const-string v0, "analytics.initial_local_dispatch_millis"

    invoke-static {v0, v6, v7, v6, v7}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    move-result-object v0

    sput-object v0, Lbqd;->f:Lbqe;

    const-string v0, "analytics.min_local_dispatch_millis"

    const-wide/32 v2, 0x1d4c0

    .line 6000
    invoke-static {v0, v2, v3, v2, v3}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    .line 0
    const-string v0, "analytics.max_local_dispatch_millis"

    const-wide/32 v2, 0x6ddd00

    .line 7000
    invoke-static {v0, v2, v3, v2, v3}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    .line 0
    const-string v0, "analytics.dispatch_alarm_millis"

    const-wide/32 v2, 0x6ddd00

    .line 8000
    invoke-static {v0, v2, v3, v2, v3}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->g:Lbqe;

    const-string v0, "analytics.max_dispatch_alarm_millis"

    const-wide/32 v2, 0x1ee6280

    .line 9000
    invoke-static {v0, v2, v3, v2, v3}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->h:Lbqe;

    const-string v0, "analytics.max_hits_per_dispatch"

    .line 10000
    invoke-static {v0, v9, v9}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->i:Lbqe;

    const-string v0, "analytics.max_hits_per_batch"

    .line 11000
    invoke-static {v0, v9, v9}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->j:Lbqe;

    const-string v0, "analytics.insecure_host"

    const-string v1, "http://www.google-analytics.com"

    .line 12000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->k:Lbqe;

    const-string v0, "analytics.secure_host"

    const-string v1, "https://ssl.google-analytics.com"

    .line 13000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->l:Lbqe;

    const-string v0, "analytics.simple_endpoint"

    const-string v1, "/collect"

    .line 14000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->m:Lbqe;

    const-string v0, "analytics.batching_endpoint"

    const-string v1, "/batch"

    .line 15000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->n:Lbqe;

    const-string v0, "analytics.max_get_length"

    const/16 v1, 0x7f4

    .line 16000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->o:Lbqe;

    const-string v0, "analytics.batching_strategy.k"

    sget-object v1, Lbrs;->b:Lbrs;

    invoke-virtual {v1}, Lbrs;->name()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lbrs;->b:Lbrs;

    invoke-virtual {v2}, Lbrs;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lbqe;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbqe;

    move-result-object v0

    sput-object v0, Lbqd;->p:Lbqe;

    const-string v0, "analytics.compression_strategy.k"

    sget-object v1, Lbrw;->a:Lbrw;

    invoke-virtual {v1}, Lbrw;->name()Ljava/lang/String;

    move-result-object v1

    .line 17000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->q:Lbqe;

    const-string v0, "analytics.max_hits_per_request.k"

    .line 18000
    invoke-static {v0, v9, v9}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    .line 0
    const-string v0, "analytics.max_hit_length.k"

    .line 19000
    invoke-static {v0, v10, v10}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->r:Lbqe;

    const-string v0, "analytics.max_post_length.k"

    .line 20000
    invoke-static {v0, v10, v10}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->s:Lbqe;

    const-string v0, "analytics.max_batch_post_length"

    .line 21000
    invoke-static {v0, v10, v10}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->t:Lbqe;

    const-string v0, "analytics.fallback_responses.k"

    const-string v1, "404,502"

    .line 22000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->u:Lbqe;

    const-string v0, "analytics.batch_retry_interval.seconds.k"

    const/16 v1, 0xe10

    .line 23000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->v:Lbqe;

    const-string v0, "analytics.service_monitor_interval"

    .line 24000
    invoke-static {v0, v12, v13, v12, v13}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    .line 0
    const-string v0, "analytics.http_connection.connect_timeout_millis"

    const v1, 0xea60

    .line 25000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->w:Lbqe;

    const-string v0, "analytics.http_connection.read_timeout_millis"

    const v1, 0xee48

    .line 26000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->x:Lbqe;

    const-string v0, "analytics.campaigns.time_limit"

    .line 27000
    invoke-static {v0, v12, v13, v12, v13}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->y:Lbqe;

    const-string v0, "analytics.first_party_experiment_id"

    const-string v1, ""

    .line 28000
    invoke-static {v0, v1, v1}, Lbqe;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lbqe;

    .line 0
    const-string v0, "analytics.first_party_experiment_variant"

    .line 29000
    invoke-static {v0, v8, v8}, Lbqe;->a(Ljava/lang/String;II)Lbqe;

    .line 0
    const-string v0, "analytics.test.disable_receiver"

    invoke-static {v0, v8}, Lbqe;->a(Ljava/lang/String;Z)Lbqe;

    move-result-object v0

    sput-object v0, Lbqd;->z:Lbqe;

    const-string v0, "analytics.service_client.idle_disconnect_millis"

    const-wide/16 v2, 0x2710

    const-wide/16 v4, 0x2710

    invoke-static {v0, v2, v3, v4, v5}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    move-result-object v0

    sput-object v0, Lbqd;->A:Lbqe;

    const-string v0, "analytics.service_client.connect_timeout_millis"

    .line 30000
    invoke-static {v0, v6, v7, v6, v7}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->B:Lbqe;

    const-string v0, "analytics.service_client.second_connect_delay_millis"

    .line 31000
    invoke-static {v0, v6, v7, v6, v7}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    .line 0
    const-string v0, "analytics.service_client.unexpected_reconnect_millis"

    const-wide/32 v2, 0xea60

    .line 32000
    invoke-static {v0, v2, v3, v2, v3}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    .line 0
    const-string v0, "analytics.service_client.reconnect_throttle_millis"

    const-wide/32 v2, 0x1b7740

    .line 33000
    invoke-static {v0, v2, v3, v2, v3}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->C:Lbqe;

    const-string v0, "analytics.monitoring.sample_period_millis"

    .line 34000
    invoke-static {v0, v12, v13, v12, v13}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->D:Lbqe;

    const-string v0, "analytics.initialization_warning_threshold"

    .line 35000
    invoke-static {v0, v6, v7, v6, v7}, Lbqe;->a(Ljava/lang/String;JJ)Lbqe;

    move-result-object v0

    .line 0
    sput-object v0, Lbqd;->E:Lbqe;

    return-void
.end method
