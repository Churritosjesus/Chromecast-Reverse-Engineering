.class public final Lrt;
.super Lyg;
.source "PG"


# instance fields
.field private synthetic a:Landroid/support/v7/internal/widget/ActivityChooserView;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserView;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 242
    iput-object p1, p0, Lrt;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-direct {p0, p2}, Lyg;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final a()Lyc;
    .locals 1

    .prologue
    .line 245
    iget-object v0, p0, Lrt;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->b(Landroid/support/v7/internal/widget/ActivityChooserView;)Lyc;

    move-result-object v0

    return-object v0
.end method

.method protected final b()Z
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lrt;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->a()Z

    .line 251
    const/4 v0, 0x1

    return v0
.end method

.method protected final c()Z
    .locals 1

    .prologue
    .line 256
    iget-object v0, p0, Lrt;->a:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->b()Z

    .line 257
    const/4 v0, 0x1

    return v0
.end method
