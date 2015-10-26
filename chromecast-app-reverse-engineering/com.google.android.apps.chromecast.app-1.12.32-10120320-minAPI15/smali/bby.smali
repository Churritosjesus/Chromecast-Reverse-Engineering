.class final Lbby;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Laea;


# instance fields
.field private synthetic a:Lbbx;


# direct methods
.method constructor <init>(Lbbx;)V
    .locals 0

    .prologue
    .line 140
    iput-object p1, p0, Lbby;->a:Lbbx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 140
    check-cast p1, Ldbv;

    .line 1143
    iget-object v0, p0, Lbby;->a:Lbbx;

    invoke-static {v0}, Lbbx;->a(Lbbx;)Lbca;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1144
    iget-object v0, p0, Lbby;->a:Lbbx;

    invoke-static {v0}, Lbbx;->a(Lbbx;)Lbca;

    move-result-object v0

    invoke-interface {v0, p1}, Lbca;->a(Ldbv;)V

    .line 1146
    :cond_0
    iget-object v0, p0, Lbby;->a:Lbbx;

    invoke-static {v0}, Lbbx;->b(Lbbx;)Lr;

    move-result-object v0

    invoke-virtual {v0}, Lr;->d()Z

    .line 140
    return-void
.end method
