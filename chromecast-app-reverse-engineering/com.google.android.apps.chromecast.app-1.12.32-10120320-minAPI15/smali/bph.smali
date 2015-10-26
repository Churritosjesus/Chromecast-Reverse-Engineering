.class final Lbph;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbpg;


# direct methods
.method constructor <init>(Lbpg;)V
    .locals 0

    iput-object p1, p0, Lbph;->a:Lbpg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbph;->a:Lbpg;

    iget-object v0, v0, Lbpg;->d:Lbpf;

    iget-object v1, p0, Lbph;->a:Lbpg;

    iget v1, v1, Lbpg;->a:I

    invoke-virtual {v0, v1}, Lbpf;->stopSelfResult(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1000
    sget-boolean v0, Lbyk;->a:Z

    .line 0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lbph;->a:Lbpg;

    iget-object v0, v0, Lbpg;->c:Lbql;

    const-string v1, "Device AnalyticsService processed last dispatch request"

    invoke-virtual {v0, v1}, Lbql;->b(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lbph;->a:Lbpg;

    iget-object v0, v0, Lbpg;->c:Lbql;

    const-string v1, "Local AnalyticsService processed last dispatch request"

    invoke-virtual {v0, v1}, Lbql;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
