.class final Lane;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field private synthetic a:Land;


# direct methods
.method constructor <init>(Land;)V
    .locals 0

    .prologue
    .line 169
    iput-object p1, p0, Lane;->a:Land;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Lane;->a:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 173
    iget-object v0, p0, Lane;->a:Land;

    invoke-virtual {v0}, Land;->w()V

    .line 174
    return-void
.end method
