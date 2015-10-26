.class public final Lape;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbwg;


# static fields
.field private static h:Lape;


# instance fields
.field public final a:Ljava/util/Random;

.field public b:Landroid/content/Context;

.field public c:Landroid/content/SharedPreferences;

.field public d:Lcom/google/android/gms/common/api/GoogleApiClient;

.field public e:Lbvh;

.field public f:Z

.field public g:I

.field private final i:Lblp;

.field private final j:Ljava/util/Queue;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    sput-object v0, Lape;->h:Lape;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lblp;

    const-string v1, "ClearcutAnalytics"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lape;->i:Lblp;

    .line 33
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lape;->j:Ljava/util/Queue;

    .line 34
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lape;->a:Ljava/util/Random;

    .line 40
    const/4 v0, 0x1

    iput-boolean v0, p0, Lape;->f:Z

    .line 44
    return-void
.end method

.method public static a()Lape;
    .locals 1

    .prologue
    .line 59
    sget-object v0, Lape;->h:Lape;

    if-nez v0, :cond_0

    .line 60
    new-instance v0, Lape;

    invoke-direct {v0}, Lape;-><init>()V

    sput-object v0, Lape;->h:Lape;

    .line 62
    :cond_0
    sget-object v0, Lape;->h:Lape;

    return-object v0
.end method

.method static synthetic a(Lape;)Lblp;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lape;->i:Lblp;

    return-object v0
.end method

.method private b()V
    .locals 13

    .prologue
    .line 196
    iget-object v8, p0, Lape;->j:Ljava/util/Queue;

    monitor-enter v8

    .line 197
    :goto_0
    :try_start_0
    iget-object v0, p0, Lape;->j:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 198
    iget-object v1, p0, Lape;->e:Lbvh;

    new-instance v2, Lapf;

    iget-object v0, p0, Lape;->j:Ljava/util/Queue;

    .line 199
    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lapd;

    invoke-direct {v2, p0, v0}, Lapf;-><init>(Lape;Lapd;)V

    .line 4000
    new-instance v9, Lbvj;

    .line 5000
    invoke-direct {v9, v1, v2}, Lbvj;-><init>(Lbvh;Lbvk;)V

    .line 198
    iget-object v10, p0, Lape;->d:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 6000
    iget-boolean v0, v9, Lbvj;->g:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "do not reuse LogEventBuilder"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 201
    :catchall_0
    move-exception v0

    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 6000
    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, v9, Lbvj;->g:Z

    iget-object v0, v9, Lbvj;->h:Lbvh;

    invoke-static {v0}, Lbvh;->j(Lbvh;)Lbvm;

    move-result-object v11

    .line 7000
    new-instance v12, Lcom/google/android/gms/clearcut/LogEventParcelable;

    new-instance v0, Lcom/google/android/gms/playlog/internal/PlayLoggerContext;

    iget-object v1, v9, Lbvj;->h:Lbvh;

    invoke-static {v1}, Lbvh;->h(Lbvh;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v9, Lbvj;->h:Lbvh;

    invoke-static {v2}, Lbvh;->i(Lbvh;)I

    move-result v2

    iget v3, v9, Lbvj;->a:I

    iget-object v4, v9, Lbvj;->b:Ljava/lang/String;

    iget-object v5, v9, Lbvj;->c:Ljava/lang/String;

    iget-object v6, v9, Lbvj;->d:Ljava/lang/String;

    iget-object v7, v9, Lbvj;->h:Lbvh;

    invoke-static {v7}, Lbvh;->g(Lbvh;)Z

    move-result v7

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/playlog/internal/PlayLoggerContext;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object v1, v9, Lbvj;->f:Lcmy;

    iget-object v2, v9, Lbvj;->e:Lbvk;

    invoke-direct {v12, v0, v1, v2}, Lcom/google/android/gms/clearcut/LogEventParcelable;-><init>(Lcom/google/android/gms/playlog/internal/PlayLoggerContext;Lcmy;Lbvk;)V

    .line 6000
    invoke-interface {v11, v10, v12}, Lbvm;->a(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/clearcut/LogEventParcelable;)Lbwj;

    goto :goto_0

    .line 201
    :cond_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 111
    iget-object v0, p0, Lape;->a:Ljava/util/Random;

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    move-result v0

    .line 3068
    new-instance v1, Lapg;

    invoke-direct {v1}, Lapg;-><init>()V

    .line 3069
    const/16 v2, 0x6f

    iput v2, v1, Lapg;->a:I

    .line 3099
    iput-object p1, v1, Lapg;->e:Ljava/lang/String;

    .line 114
    invoke-virtual {v1, v0}, Lapg;->c(I)Lapg;

    move-result-object v1

    .line 115
    invoke-virtual {v1}, Lapg;->a()Lapd;

    move-result-object v1

    .line 116
    invoke-virtual {p0, v1}, Lape;->a(Lapd;)V

    .line 117
    return v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 128
    return-void
.end method

.method public final a(ILjava/lang/Integer;)V
    .locals 2

    .prologue
    .line 141
    new-instance v0, Lapd;

    const/16 v1, 0xf

    invoke-direct {v0, v1, p2}, Lapd;-><init>(ILjava/lang/Integer;)V

    invoke-virtual {p0, v0}, Lape;->a(Lapd;)V

    .line 142
    return-void
.end method

.method public final a(ILjava/lang/Integer;Ljava/lang/Long;)V
    .locals 6

    .prologue
    .line 152
    new-instance v0, Lapd;

    invoke-direct {v0, p1, p2}, Lapd;-><init>(ILjava/lang/Integer;)V

    .line 153
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Lapd;->b(J)Lapd;

    .line 154
    invoke-virtual {p0, v0}, Lape;->a(Lapd;)V

    .line 155
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 122
    invoke-direct {p0}, Lape;->b()V

    .line 123
    return-void
.end method

.method public final a(Lapd;)V
    .locals 4

    .prologue
    .line 91
    .line 1129
    iget-object v0, p1, Lapd;->c:Ljava/lang/Long;

    if-nez v0, :cond_0

    .line 1130
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p1, Lapd;->b:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p1, Lapd;->c:Ljava/lang/Long;

    .line 1133
    :cond_0
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    .line 2074
    iget v0, v0, Lape;->g:I

    .line 1133
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p1, Lapd;->i:Ljava/lang/Integer;

    .line 93
    iget-boolean v0, p0, Lape;->f:Z

    if-nez v0, :cond_1

    .line 103
    :goto_0
    return-void

    .line 2185
    :cond_1
    iget-object v1, p0, Lape;->j:Ljava/util/Queue;

    monitor-enter v1

    .line 2186
    :try_start_0
    iget-object v0, p0, Lape;->j:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 2187
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    iget-object v0, p0, Lape;->d:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 99
    iget-object v0, p0, Lape;->d:Lcom/google/android/gms/common/api/GoogleApiClient;

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b()V

    goto :goto_0

    .line 2187
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 101
    :cond_2
    invoke-direct {p0}, Lape;->b()V

    goto :goto_0
.end method

.method public final b(I)V
    .locals 1

    .prologue
    .line 134
    new-instance v0, Lapd;

    invoke-direct {v0, p1}, Lapd;-><init>(I)V

    invoke-virtual {p0, v0}, Lape;->a(Lapd;)V

    .line 135
    return-void
.end method
