.class final Lahc;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:J

.field b:J

.field c:J

.field d:J

.field private final e:Laga;

.field private final f:Landroid/os/Handler;


# direct methods
.method constructor <init>(Landroid/os/Handler;Laga;)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p2, p0, Lahc;->e:Laga;

    .line 34
    iput-object p1, p0, Lahc;->f:Landroid/os/Handler;

    .line 36
    invoke-static {}, Lafv;->g()J

    move-result-wide v0

    iput-wide v0, p0, Lahc;->a:J

    .line 37
    return-void
.end method


# virtual methods
.method final a()V
    .locals 8

    .prologue
    .line 60
    iget-wide v0, p0, Lahc;->b:J

    iget-wide v2, p0, Lahc;->c:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 61
    iget-object v0, p0, Lahc;->e:Laga;

    .line 1882
    iget-object v3, v0, Laga;->e:Lagf;

    .line 62
    iget-wide v0, p0, Lahc;->d:J

    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    if-lez v0, :cond_1

    instance-of v0, v3, Lagh;

    if-eqz v0, :cond_1

    .line 64
    iget-wide v4, p0, Lahc;->b:J

    .line 65
    iget-wide v6, p0, Lahc;->d:J

    .line 66
    check-cast v3, Lagh;

    .line 68
    iget-object v0, p0, Lahc;->f:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 72
    iget-object v0, p0, Lahc;->f:Landroid/os/Handler;

    new-instance v1, Lahd;

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lahd;-><init>(Lahc;Lagh;JJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 79
    :cond_0
    iget-wide v0, p0, Lahc;->b:J

    iput-wide v0, p0, Lahc;->c:J

    .line 82
    :cond_1
    return-void
.end method
