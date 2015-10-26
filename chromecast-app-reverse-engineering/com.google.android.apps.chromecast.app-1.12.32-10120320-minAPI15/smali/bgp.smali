.class final Lbgp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field private synthetic a:Lbgo;


# direct methods
.method constructor <init>(Lbgo;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lbgp;->a:Lbgo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .prologue
    .line 73
    iget-object v0, p0, Lbgp;->a:Lbgo;

    invoke-static {v0}, Lbgo;->a(Lbgo;)V

    .line 74
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 78
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 82
    return-void
.end method
