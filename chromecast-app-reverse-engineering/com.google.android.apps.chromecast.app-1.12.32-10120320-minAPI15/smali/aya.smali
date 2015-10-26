.class final Laya;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ldbf;

.field private synthetic b:Lapd;


# direct methods
.method constructor <init>(Laxy;Ldbf;Lapd;)V
    .locals 0

    .prologue
    .line 86
    iput-object p2, p0, Laya;->a:Ldbf;

    iput-object p3, p0, Laya;->b:Lapd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 89
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Laya;->a:Ldbf;

    iget-object v1, v1, Ldbf;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 90
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Laya;->b:Lapd;

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 91
    return-void
.end method
