.class public final Lbay;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ldaw;

.field private synthetic b:Lapd;


# direct methods
.method public constructor <init>(Lbax;Ldaw;Lapd;)V
    .locals 0

    .prologue
    .line 104
    iput-object p2, p0, Lbay;->a:Ldaw;

    iput-object p3, p0, Lbay;->b:Lapd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 107
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lbay;->a:Ldaw;

    iget-object v1, v1, Ldaw;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 108
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lbay;->b:Lapd;

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 109
    return-void
.end method
