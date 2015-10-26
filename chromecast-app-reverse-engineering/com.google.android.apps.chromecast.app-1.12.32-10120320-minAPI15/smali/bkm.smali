.class public final Lbkm;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field static final b:J


# instance fields
.field public final a:Landroid/util/LruCache;

.field private final c:Lbkl;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 19
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lbkm;->b:J

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 23
    invoke-static {}, Lbkl;->a()Lbkl;

    move-result-object v0

    invoke-direct {p0, v0}, Lbkm;-><init>(Lbkl;)V

    .line 24
    return-void
.end method

.method private constructor <init>(Lbkl;)V
    .locals 2

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Landroid/util/LruCache;

    const/16 v1, 0x64

    invoke-direct {v0, v1}, Landroid/util/LruCache;-><init>(I)V

    iput-object v0, p0, Lbkm;->a:Landroid/util/LruCache;

    .line 27
    iput-object p1, p0, Lbkm;->c:Lbkl;

    .line 28
    return-void
.end method

.method static synthetic a(Lbkm;)Lbkl;
    .locals 1

    .prologue
    .line 13
    iget-object v0, p0, Lbkm;->c:Lbkl;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ldbi;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 48
    iget-object v3, p0, Lbkm;->a:Landroid/util/LruCache;

    monitor-enter v3

    .line 49
    :try_start_0
    iget-object v0, p0, Lbkm;->a:Landroid/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbkn;

    .line 50
    if-nez v0, :cond_0

    .line 51
    monitor-exit v3

    move-object v0, v1

    .line 56
    :goto_0
    return-object v0

    .line 1043
    :cond_0
    iget-wide v4, v0, Lbkn;->a:J

    iget-object v2, v0, Lbkn;->c:Lbkm;

    .line 2013
    iget-object v2, v2, Lbkm;->c:Lbkl;

    .line 1043
    invoke-static {}, Lbkl;->b()J

    move-result-wide v6

    sub-long/2addr v4, v6

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-gtz v2, :cond_1

    const/4 v2, 0x1

    .line 52
    :goto_1
    if-eqz v2, :cond_2

    .line 53
    iget-object v0, p0, Lbkm;->a:Landroid/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    monitor-exit v3

    move-object v0, v1

    goto :goto_0

    .line 1043
    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    .line 2033
    :cond_2
    iget-object v0, v0, Lbkn;->b:Ljava/lang/Object;

    .line 56
    check-cast v0, Ldbi;

    monitor-exit v3

    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
