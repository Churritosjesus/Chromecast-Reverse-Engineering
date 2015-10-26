.class final Laxe;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Laxd;


# direct methods
.method constructor <init>(Laxd;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Laxe;->a:Laxd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    .line 79
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 80
    iget-object v2, p0, Laxe;->a:Laxd;

    .line 1029
    iget-boolean v2, v2, Laxd;->n:Z

    .line 80
    if-nez v2, :cond_0

    iget-object v2, p0, Laxe;->a:Laxd;

    .line 2029
    iget-object v2, v2, Laxd;->c:Ldat;

    .line 80
    if-eqz v2, :cond_0

    iget-object v2, p0, Laxe;->a:Laxd;

    .line 3029
    iget-object v2, v2, Laxd;->d:Ldat;

    .line 80
    if-eqz v2, :cond_0

    iget-object v2, p0, Laxe;->a:Laxd;

    .line 4029
    iget-wide v2, v2, Laxd;->m:J

    .line 81
    iget-object v4, p0, Laxe;->a:Laxd;

    .line 5029
    iget-wide v4, v4, Laxd;->l:J

    .line 81
    add-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 82
    :cond_0
    iget-object v0, p0, Laxe;->a:Laxd;

    invoke-virtual {v0}, Laxd;->a()V

    .line 83
    iget-object v0, p0, Laxe;->a:Laxd;

    invoke-virtual {v0}, Laxd;->b()V

    .line 85
    :cond_1
    return-void
.end method
