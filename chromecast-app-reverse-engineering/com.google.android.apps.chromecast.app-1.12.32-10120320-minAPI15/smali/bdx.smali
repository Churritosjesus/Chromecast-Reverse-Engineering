.class final Lbdx;
.super Lbey;
.source "PG"


# instance fields
.field final synthetic a:Lbdw;


# direct methods
.method constructor <init>(Lbdw;Lbdn;)V
    .locals 1

    .prologue
    .line 357
    iput-object p1, p0, Lbdx;->a:Lbdw;

    iget-object v0, p1, Lbdw;->e:Lbdu;

    invoke-direct {p0, v0, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    .line 364
    iget-object v0, p0, Lbdx;->a:Lbdw;

    iget-object v0, v0, Lbdw;->e:Lbdu;

    .line 1033
    iget-object v0, v0, Lbdu;->a:Landroid/os/Handler;

    .line 364
    new-instance v1, Lbdy;

    invoke-direct {v1, p0}, Lbdy;-><init>(Lbdx;)V

    iget-object v2, p0, Lbdx;->a:Lbdw;

    iget-object v2, v2, Lbdw;->d:Landroid/content/Context;

    .line 371
    invoke-static {v2}, Lblf;->U(Landroid/content/Context;)J

    move-result-wide v2

    .line 364
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 372
    return-void
.end method
