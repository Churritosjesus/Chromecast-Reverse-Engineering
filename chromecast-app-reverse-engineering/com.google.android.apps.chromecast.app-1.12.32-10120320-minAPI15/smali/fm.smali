.class public final Lfm;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static a:Lfn;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 55
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 57
    new-instance v0, Lfp;

    invoke-direct {v0}, Lfp;-><init>()V

    sput-object v0, Lfm;->a:Lfn;

    .line 63
    :goto_0
    return-void

    .line 58
    :cond_0
    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    .line 59
    new-instance v0, Lfo;

    invoke-direct {v0}, Lfo;-><init>()V

    sput-object v0, Lfm;->a:Lfn;

    goto :goto_0

    .line 61
    :cond_1
    new-instance v0, Lfn;

    invoke-direct {v0}, Lfn;-><init>()V

    sput-object v0, Lfm;->a:Lfn;

    goto :goto_0
.end method

.method public static a(Landroid/view/LayoutInflater;Lfs;)V
    .locals 1

    .prologue
    .line 79
    sget-object v0, Lfm;->a:Lfn;

    invoke-virtual {v0, p0, p1}, Lfn;->a(Landroid/view/LayoutInflater;Lfs;)V

    .line 80
    return-void
.end method
