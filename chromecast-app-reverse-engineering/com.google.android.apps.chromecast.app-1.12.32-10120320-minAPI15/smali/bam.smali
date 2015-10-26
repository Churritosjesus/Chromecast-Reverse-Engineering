.class final Lbam;
.super Lmn;
.source "PG"


# instance fields
.field private synthetic g:Lmm;

.field private synthetic h:Lbah;


# direct methods
.method constructor <init>(Lbah;Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;IILmm;)V
    .locals 0

    .prologue
    .line 220
    iput-object p1, p0, Lbam;->h:Lbah;

    iput-object p6, p0, Lbam;->g:Lmm;

    invoke-direct {p0, p2, p3, p4, p5}, Lmn;-><init>(Landroid/app/Activity;Landroid/support/v4/widget/DrawerLayout;II)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 229
    iget-object v0, p0, Lbam;->g:Lmm;

    .line 1188
    invoke-virtual {v0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->f()V

    .line 230
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    const/16 v2, 0x71

    invoke-direct {v1, v2}, Lapd;-><init>(I)V

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 231
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 223
    iget-object v0, p0, Lbam;->h:Lbah;

    invoke-static {v0}, Lbah;->c(Lbah;)V

    .line 224
    return-void
.end method
