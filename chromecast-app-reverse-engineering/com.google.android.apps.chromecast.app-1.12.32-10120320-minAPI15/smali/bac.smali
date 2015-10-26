.class final Lbac;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbab;


# direct methods
.method constructor <init>(Lbab;Lazv;)V
    .locals 0

    .prologue
    .line 433
    iput-object p1, p0, Lbac;->a:Lbab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 437
    iget-object v0, p0, Lbac;->a:Lbab;

    .line 1411
    iget-boolean v0, v0, Lbab;->c:Z

    .line 437
    if-eqz v0, :cond_0

    .line 438
    iget-object v0, p0, Lbac;->a:Lbab;

    .line 2411
    iget-object v0, v0, Lbab;->a:Lbaa;

    .line 438
    const/4 v1, 0x0

    .line 3036
    invoke-static {v0, v1}, Lazv;->a(Lbaa;Z)V

    .line 440
    :cond_0
    iget-object v0, p0, Lbac;->a:Lbab;

    invoke-virtual {v0}, Lbab;->a()V

    .line 441
    return-void
.end method
