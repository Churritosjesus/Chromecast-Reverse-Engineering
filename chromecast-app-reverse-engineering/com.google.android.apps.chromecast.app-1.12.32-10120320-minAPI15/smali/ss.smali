.class final Lss;
.super Lyg;
.source "PG"


# instance fields
.field private synthetic a:Lsw;

.field private synthetic b:Lsr;


# direct methods
.method constructor <init>(Lsr;Landroid/view/View;Lsw;)V
    .locals 0

    .prologue
    .line 191
    iput-object p1, p0, Lss;->b:Lsr;

    iput-object p3, p0, Lss;->a:Lsw;

    invoke-direct {p0, p2}, Lyg;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a()Lyc;
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lss;->a:Lsw;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 199
    iget-object v0, p0, Lss;->b:Lsr;

    invoke-static {v0}, Lsr;->a(Lsr;)Lta;

    move-result-object v0

    invoke-interface {v0}, Lta;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 200
    iget-object v0, p0, Lss;->b:Lsr;

    invoke-static {v0}, Lsr;->a(Lsr;)Lta;

    move-result-object v0

    invoke-interface {v0}, Lta;->c()V

    .line 202
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
