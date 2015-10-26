.class public Landroid/support/v7/internal/widget/FitWindowsLinearLayout;
.super Landroid/widget/LinearLayout;
.source "PG"

# interfaces
.implements Lsg;


# instance fields
.field private a:Lsh;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 33
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    return-void
.end method


# virtual methods
.method public final a(Lsh;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Landroid/support/v7/internal/widget/FitWindowsLinearLayout;->a:Lsh;

    .line 41
    return-void
.end method

.method protected fitSystemWindows(Landroid/graphics/Rect;)Z
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Landroid/support/v7/internal/widget/FitWindowsLinearLayout;->a:Lsh;

    if-eqz v0, :cond_0

    .line 46
    iget-object v0, p0, Landroid/support/v7/internal/widget/FitWindowsLinearLayout;->a:Lsh;

    invoke-interface {v0, p1}, Lsh;->a(Landroid/graphics/Rect;)V

    .line 48
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->fitSystemWindows(Landroid/graphics/Rect;)Z

    move-result v0

    return v0
.end method
