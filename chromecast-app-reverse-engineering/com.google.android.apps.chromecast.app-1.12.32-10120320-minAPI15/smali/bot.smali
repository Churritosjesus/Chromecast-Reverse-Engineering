.class final Lbot;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field private synthetic a:Lbos;


# direct methods
.method constructor <init>(Lbos;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lbot;->a:Lbos;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lbot;->a:Lbos;

    invoke-static {v0}, Lbos;->a(Lbos;)V

    .line 78
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 82
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 86
    return-void
.end method
