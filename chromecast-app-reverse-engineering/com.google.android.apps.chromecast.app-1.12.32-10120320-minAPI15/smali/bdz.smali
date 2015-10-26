.class final Lbdz;
.super Lbey;
.source "PG"


# instance fields
.field private synthetic a:J

.field private synthetic c:Landroid/content/Context;

.field private synthetic d:Lbdn;

.field private synthetic e:Lbdu;


# direct methods
.method constructor <init>(Lbdu;Lbdn;JLandroid/content/Context;Lbdn;)V
    .locals 1

    .prologue
    .line 386
    iput-object p1, p0, Lbdz;->e:Lbdu;

    iput-wide p3, p0, Lbdz;->a:J

    iput-object p5, p0, Lbdz;->c:Landroid/content/Context;

    iput-object p6, p0, Lbdz;->d:Lbdn;

    invoke-direct {p0, p1, p2}, Lbey;-><init>(Lbdu;Lbdn;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    .line 390
    iget-object v2, p0, Lbdz;->e:Lbdu;

    const-string v3, "scanNetworks"

    iget-wide v4, p0, Lbdz;->a:J

    iget-object v0, p0, Lbdz;->c:Landroid/content/Context;

    iget-object v6, p0, Lbdz;->d:Lbdn;

    .line 1400
    new-instance v1, Lbea;

    invoke-direct/range {v1 .. v6}, Lbea;-><init>(Lbdu;Ljava/lang/String;JLbdn;)V

    .line 1419
    iget-object v2, v2, Lbdu;->a:Landroid/os/Handler;

    invoke-static {v0}, Lblf;->U(Landroid/content/Context;)J

    move-result-wide v4

    invoke-virtual {v2, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 391
    return-void
.end method
