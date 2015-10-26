.class public final Lavs;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:I

.field final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(ILandroid/os/Handler;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput p1, p0, Lavs;->a:I

    .line 21
    iput-object p2, p0, Lavs;->b:Landroid/os/Handler;

    .line 22
    return-void
.end method
