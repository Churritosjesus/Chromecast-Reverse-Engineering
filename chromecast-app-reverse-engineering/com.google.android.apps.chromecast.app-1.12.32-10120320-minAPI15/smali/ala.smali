.class public Lala;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Lj;


# direct methods
.method public constructor <init>(Lj;)V
    .locals 1

    .prologue
    .line 2543
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2544
    const-string v0, "fragment"

    invoke-static {p1, v0}, Lajp;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2545
    iput-object p1, p0, Lala;->a:Lj;

    .line 2546
    return-void
.end method


# virtual methods
.method public a()Landroid/app/Activity;
    .locals 1

    .prologue
    .line 1555
    iget-object v0, p0, Lala;->a:Lj;

    .line 1612
    iget-object v0, v0, Lj;->y:Lm;

    .line 1555
    return-object v0
.end method

.method public a(Landroid/content/Intent;I)V
    .locals 1

    .prologue
    .line 1550
    iget-object v0, p0, Lala;->a:Lj;

    invoke-virtual {v0, p1, p2}, Lj;->a(Landroid/content/Intent;I)V

    .line 1551
    return-void
.end method
