.class final Lbow;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbos;


# direct methods
.method constructor <init>(Lbos;)V
    .locals 0

    .prologue
    .line 134
    iput-object p1, p0, Lbow;->a:Lbos;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lbow;->a:Lbos;

    invoke-static {v0}, Lbos;->d(Lbos;)Landroid/widget/Spinner;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Spinner;->performClick()Z

    .line 138
    return-void
.end method
