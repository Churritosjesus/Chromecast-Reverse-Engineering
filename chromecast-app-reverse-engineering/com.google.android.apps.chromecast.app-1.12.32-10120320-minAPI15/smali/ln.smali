.class public final Lln;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static a:Llp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 63
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 64
    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 65
    new-instance v0, Llo;

    invoke-direct {v0}, Llo;-><init>()V

    sput-object v0, Lln;->a:Llp;

    .line 69
    :goto_0
    return-void

    .line 67
    :cond_0
    new-instance v0, Llp;

    invoke-direct {v0}, Llp;-><init>()V

    sput-object v0, Lln;->a:Llp;

    goto :goto_0
.end method

.method public static a(Landroid/widget/PopupWindow;Landroid/view/View;III)V
    .locals 6

    .prologue
    .line 93
    sget-object v0, Lln;->a:Llp;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Llp;->a(Landroid/widget/PopupWindow;Landroid/view/View;III)V

    .line 94
    return-void
.end method
