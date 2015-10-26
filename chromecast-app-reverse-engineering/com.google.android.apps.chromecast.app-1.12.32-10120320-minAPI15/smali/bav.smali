.class public final Lbav;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ldaq;

.field private synthetic b:Lapd;


# direct methods
.method public constructor <init>(Lbau;Ldaq;Lapd;)V
    .locals 0

    .prologue
    .line 77
    iput-object p2, p0, Lbav;->a:Ldaq;

    iput-object p3, p0, Lbav;->b:Lapd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 80
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lbav;->a:Ldaq;

    iget-object v1, v1, Ldaq;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 81
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lbav;->b:Lapd;

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 82
    return-void
.end method
