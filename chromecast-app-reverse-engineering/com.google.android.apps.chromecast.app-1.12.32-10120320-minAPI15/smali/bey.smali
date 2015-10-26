.class Lbey;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbff;


# instance fields
.field private synthetic a:Lbdu;

.field final b:Lbdn;


# direct methods
.method public constructor <init>(Lbdu;Lbdn;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lbey;->a:Lbdu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p2, p0, Lbey;->b:Lbdn;

    .line 85
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 89
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lbey;->a(Ljava/lang/Object;)V

    .line 90
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 94
    iget-object v0, p0, Lbey;->a:Lbdu;

    .line 1033
    iget-object v0, v0, Lbdu;->a:Landroid/os/Handler;

    .line 94
    new-instance v1, Lbez;

    invoke-direct {v1, p0, p1}, Lbez;-><init>(Lbey;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 100
    return-void
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 108
    iget-object v0, p0, Lbey;->a:Lbdu;

    .line 2033
    iget-object v0, v0, Lbdu;->a:Landroid/os/Handler;

    .line 108
    new-instance v1, Lbfa;

    invoke-direct {v1, p0, p1}, Lbfa;-><init>(Lbey;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 114
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 104
    const/16 v0, -0x63

    invoke-virtual {p0, v0}, Lbey;->a(I)V

    .line 105
    return-void
.end method
