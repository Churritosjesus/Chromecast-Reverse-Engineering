.class final Lmd;
.super Landroid/view/animation/Animation;
.source "PG"


# instance fields
.field private synthetic a:Llw;


# direct methods
.method constructor <init>(Llw;)V
    .locals 0

    .prologue
    .line 898
    iput-object p1, p0, Lmd;->a:Llw;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 1

    .prologue
    .line 901
    iget-object v0, p0, Lmd;->a:Llw;

    invoke-static {v0, p1}, Llw;->b(Llw;F)V

    .line 902
    return-void
.end method
