.class final Lacj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field private synthetic a:Lacb;


# direct methods
.method constructor <init>(Lacb;)V
    .locals 0

    .prologue
    .line 326
    iput-object p1, p0, Lacj;->a:Lacb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    .prologue
    .line 329
    iget-object v0, p0, Lacj;->a:Lacb;

    invoke-virtual {v0}, Lacb;->d()V

    .line 330
    return-void
.end method
