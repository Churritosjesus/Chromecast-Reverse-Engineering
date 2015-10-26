.class public Lm;
.super Landroid/app/Activity;
.source "PG"


# instance fields
.field final a:Landroid/os/Handler;

.field public final b:Lt;

.field c:Z

.field d:Z

.field private e:Lq;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Lep;

.field private m:Lar;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 76
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 87
    new-instance v0, Ln;

    invoke-direct {v0, p0}, Ln;-><init>(Lm;)V

    iput-object v0, p0, Lm;->a:Landroid/os/Handler;

    .line 106
    new-instance v0, Lt;

    invoke-direct {v0}, Lt;-><init>()V

    iput-object v0, p0, Lm;->b:Lt;

    .line 107
    new-instance v0, Lo;

    invoke-direct {v0, p0}, Lo;-><init>(Lm;)V

    iput-object v0, p0, Lm;->e:Lq;

    .line 134
    return-void
.end method

.method private static a(Landroid/view/View;)Ljava/lang/String;
    .locals 7

    .prologue
    const/16 v3, 0x56

    const/16 v1, 0x46

    const/16 v6, 0x2c

    const/16 v5, 0x20

    const/16 v2, 0x2e

    .line 676
    new-instance v4, Ljava/lang/StringBuilder;

    const/16 v0, 0x80

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 677
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 678
    const/16 v0, 0x7b

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 679
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 680
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 681
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 685
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 687
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 688
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x45

    :goto_2
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 689
    invoke-virtual {p0}, Landroid/view/View;->willNotDraw()Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    :goto_3
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 690
    invoke-virtual {p0}, Landroid/view/View;->isHorizontalScrollBarEnabled()Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x48

    :goto_4
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 691
    invoke-virtual {p0}, Landroid/view/View;->isVerticalScrollBarEnabled()Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v3

    :goto_5
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 692
    invoke-virtual {p0}, Landroid/view/View;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_7

    const/16 v0, 0x43

    :goto_6
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 693
    invoke-virtual {p0}, Landroid/view/View;->isLongClickable()Z

    move-result v0

    if-eqz v0, :cond_8

    const/16 v0, 0x4c

    :goto_7
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 694
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 695
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_9

    :goto_8
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 696
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_a

    const/16 v0, 0x53

    :goto_9
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 697
    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v2, 0x50

    :cond_0
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 698
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 699
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 700
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 701
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 702
    const/16 v0, 0x2d

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 703
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 704
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 705
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 706
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v1

    .line 707
    const/4 v0, -0x1

    if-eq v1, v0, :cond_1

    .line 708
    const-string v0, " #"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 709
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 710
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 711
    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    .line 714
    const/high16 v0, -0x1000000

    and-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_1

    .line 722
    :try_start_0
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object v0

    .line 725
    :goto_a
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    .line 726
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v1

    .line 727
    const-string v2, " "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 728
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 729
    const-string v0, ":"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 730
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 731
    const-string v0, "/"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 732
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 737
    :cond_1
    :goto_b
    const-string v0, "}"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 738
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 682
    :sswitch_0
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 683
    :sswitch_1
    const/16 v0, 0x49

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 684
    :sswitch_2
    const/16 v0, 0x47

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_2
    move v0, v2

    .line 687
    goto/16 :goto_1

    :cond_3
    move v0, v2

    .line 688
    goto/16 :goto_2

    .line 689
    :cond_4
    const/16 v0, 0x44

    goto/16 :goto_3

    :cond_5
    move v0, v2

    .line 690
    goto/16 :goto_4

    :cond_6
    move v0, v2

    .line 691
    goto/16 :goto_5

    :cond_7
    move v0, v2

    .line 692
    goto/16 :goto_6

    :cond_8
    move v0, v2

    .line 693
    goto/16 :goto_7

    :cond_9
    move v1, v2

    .line 695
    goto/16 :goto_8

    :cond_a
    move v0, v2

    .line 696
    goto/16 :goto_9

    .line 716
    :sswitch_3
    :try_start_1
    const-string v0, "app"

    goto :goto_a

    .line 719
    :sswitch_4
    const-string v0, "android"
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_a

    :catch_0
    move-exception v0

    goto :goto_b

    .line 681
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x4 -> :sswitch_1
        0x8 -> :sswitch_2
    .end sparse-switch

    .line 714
    :sswitch_data_1
    .sparse-switch
        0x1000000 -> :sswitch_4
        0x7f000000 -> :sswitch_3
    .end sparse-switch
.end method

.method private a(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V
    .locals 4

    .prologue
    .line 742
    invoke-virtual {p2, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 743
    if-nez p3, :cond_1

    .line 744
    const-string v0, "null"

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 760
    :cond_0
    return-void

    .line 747
    :cond_1
    invoke-static {p3}, Lm;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 748
    instance-of v0, p3, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 751
    check-cast p3, Landroid/view/ViewGroup;

    .line 752
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 753
    if-lez v1, :cond_0

    .line 756
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "  "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 757
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 758
    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-direct {p0, v2, p2, v3}, Lm;->a(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V

    .line 757
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method final a(Ljava/lang/String;ZZ)Lar;
    .locals 2

    .prologue
    .line 866
    iget-object v0, p0, Lm;->l:Lep;

    if-nez v0, :cond_0

    .line 867
    new-instance v0, Lep;

    invoke-direct {v0}, Lep;-><init>()V

    iput-object v0, p0, Lm;->l:Lep;

    .line 869
    :cond_0
    iget-object v0, p0, Lm;->l:Lep;

    invoke-virtual {v0, p1}, Lep;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lar;

    .line 870
    if-nez v0, :cond_2

    .line 871
    if-eqz p3, :cond_1

    .line 872
    new-instance v0, Lar;

    invoke-direct {v0, p1, p0, p2}, Lar;-><init>(Ljava/lang/String;Lm;Z)V

    .line 873
    iget-object v1, p0, Lm;->l:Lep;

    invoke-virtual {v1, p1, v0}, Lep;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 878
    :cond_1
    :goto_0
    return-object v0

    .line 11484
    :cond_2
    iput-object p0, v0, Lar;->e:Lm;

    goto :goto_0
.end method

.method public final a(Lj;Landroid/content/Intent;I)V
    .locals 2

    .prologue
    const/4 v0, -0x1

    .line 828
    if-ne p3, v0, :cond_0

    .line 829
    invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 836
    :goto_0
    return-void

    .line 832
    :cond_0
    const/high16 v0, -0x10000

    and-int/2addr v0, p3

    if-eqz v0, :cond_1

    .line 833
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can only use lower 16 bits for requestCode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 835
    :cond_1
    iget v0, p1, Lj;->k:I

    add-int/lit8 v0, v0, 0x1

    shl-int/lit8 v0, v0, 0x10

    const v1, 0xffff

    and-int/2addr v1, p3

    add-int/2addr v0, v1

    invoke-super {p0, p2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method final a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 840
    iget-object v0, p0, Lm;->l:Lep;

    if-eqz v0, :cond_0

    .line 841
    iget-object v0, p0, Lm;->l:Lep;

    invoke-virtual {v0, p1}, Lep;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lar;

    .line 842
    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lar;->g:Z

    if-nez v1, :cond_0

    .line 843
    invoke-virtual {v0}, Lar;->g()V

    .line 844
    iget-object v0, p0, Lm;->l:Lep;

    invoke-virtual {v0, p1}, Lep;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 847
    :cond_0
    return-void
.end method

.method final a(Z)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 763
    iget-boolean v0, p0, Lm;->h:Z

    if-nez v0, :cond_1

    .line 764
    iput-boolean v1, p0, Lm;->h:Z

    .line 765
    iput-boolean p1, p0, Lm;->d:Z

    .line 766
    iget-object v0, p0, Lm;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 10779
    iget-boolean v0, p0, Lm;->k:Z

    if-eqz v0, :cond_0

    .line 10780
    iput-boolean v2, p0, Lm;->k:Z

    .line 10781
    iget-object v0, p0, Lm;->m:Lar;

    if-eqz v0, :cond_0

    .line 10782
    iget-boolean v0, p0, Lm;->d:Z

    if-nez v0, :cond_2

    .line 10783
    iget-object v0, p0, Lm;->m:Lar;

    invoke-virtual {v0}, Lar;->c()V

    .line 10790
    :cond_0
    :goto_0
    iget-object v0, p0, Lm;->b:Lt;

    .line 10956
    const/4 v1, 0x2

    invoke-virtual {v0, v1, v2}, Lt;->a(IZ)V

    .line 769
    :cond_1
    return-void

    .line 10785
    :cond_2
    iget-object v0, p0, Lm;->m:Lar;

    invoke-virtual {v0}, Lar;->d()V

    goto :goto_0
.end method

.method public a_()V
    .locals 2

    .prologue
    .line 626
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    .line 10029
    invoke-virtual {p0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 636
    :goto_0
    return-void

    .line 635
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lm;->i:Z

    goto :goto_0
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 649
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 653
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 654
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 655
    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 656
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 657
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 658
    iget-boolean v1, p0, Lm;->f:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, "mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 659
    iget-boolean v1, p0, Lm;->g:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 660
    iget-boolean v1, p0, Lm;->c:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mReallyStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 661
    iget-boolean v1, p0, Lm;->h:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Z)V

    .line 662
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mLoadersStarted="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 663
    iget-boolean v0, p0, Lm;->k:Z

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 664
    iget-object v0, p0, Lm;->m:Lar;

    if-eqz v0, :cond_0

    .line 665
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Loader Manager "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 666
    iget-object v0, p0, Lm;->m:Lar;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 667
    const-string v0, ":"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 668
    iget-object v0, p0, Lm;->m:Lar;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2, p3, p4}, Lar;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 670
    :cond_0
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0, p1, p2, p3, p4}, Lt;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 671
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "View Hierarchy:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 672
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lm;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, v0, p3, v1}, Lm;->a(Ljava/lang/String;Ljava/io/PrintWriter;Landroid/view/View;)V

    .line 673
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 151
    iget-object v0, p0, Lm;->b:Lt;

    .line 2919
    const/4 v1, 0x0

    iput-boolean v1, v0, Lt;->j:Z

    .line 152
    shr-int/lit8 v0, p1, 0x10

    .line 153
    if-eqz v0, :cond_3

    .line 154
    add-int/lit8 v0, v0, -0x1

    .line 155
    iget-object v1, p0, Lm;->b:Lt;

    iget-object v1, v1, Lt;->b:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    if-ltz v0, :cond_0

    iget-object v1, p0, Lm;->b:Lt;

    iget-object v1, v1, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 156
    :cond_0
    const-string v0, "FragmentActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Activity result fragment index out of range: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    :goto_0
    return-void

    .line 160
    :cond_1
    iget-object v1, p0, Lm;->b:Lt;

    iget-object v1, v1, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 161
    if-nez v0, :cond_2

    .line 162
    const-string v0, "FragmentActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Activity result no fragment exists for index: 0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 165
    :cond_2
    const v1, 0xffff

    and-int/2addr v1, p1

    invoke-virtual {v0, v1, p2, p3}, Lj;->a(IILandroid/content/Intent;)V

    goto :goto_0

    .line 170
    :cond_3
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 178
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4158
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 5035
    invoke-virtual {p0}, Landroid/app/Activity;->finishAfterTransition()V

    .line 4159
    :cond_0
    :goto_0
    return-void

    .line 4161
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 242
    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 243
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0, p1}, Lt;->a(Landroid/content/res/Configuration;)V

    .line 244
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 251
    iget-object v0, p0, Lm;->b:Lt;

    iget-object v2, p0, Lm;->e:Lq;

    invoke-virtual {v0, p0, v2, v1}, Lt;->a(Lm;Lq;Lj;)V

    .line 253
    invoke-virtual {p0}, Lm;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v0

    if-nez v0, :cond_0

    .line 254
    invoke-virtual {p0}, Lm;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V

    .line 257
    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 259
    invoke-virtual {p0}, Lm;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp;

    .line 261
    if-eqz v0, :cond_1

    .line 262
    iget-object v2, v0, Lp;->b:Lep;

    iput-object v2, p0, Lm;->l:Lep;

    .line 264
    :cond_1
    if-eqz p1, :cond_2

    .line 265
    const-string v2, "android:support:fragments"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v2

    .line 266
    iget-object v3, p0, Lm;->b:Lt;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lp;->a:Ljava/util/ArrayList;

    :goto_0
    invoke-virtual {v3, v2, v0}, Lt;->a(Landroid/os/Parcelable;Ljava/util/ArrayList;)V

    .line 268
    :cond_2
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->j()V

    .line 269
    return-void

    :cond_3
    move-object v0, v1

    .line 266
    goto :goto_0
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 3

    .prologue
    .line 276
    if-nez p1, :cond_1

    .line 277
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    .line 278
    iget-object v1, p0, Lm;->b:Lt;

    invoke-virtual {p0}, Lm;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Lt;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 279
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    .line 287
    :goto_0
    return v0

    .line 285
    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    .line 287
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .prologue
    .line 296
    const-string v0, "fragment"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 297
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 304
    :cond_0
    :goto_0
    return-object v0

    .line 300
    :cond_1
    iget-object v0, p0, Lm;->b:Lt;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2, p3}, Lt;->a(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 301
    if-nez v0, :cond_0

    .line 302
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 312
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 314
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lm;->a(Z)V

    .line 316
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->p()V

    .line 317
    iget-object v0, p0, Lm;->m:Lar;

    if-eqz v0, :cond_0

    .line 318
    iget-object v0, p0, Lm;->m:Lar;

    invoke-virtual {v0}, Lar;->g()V

    .line 320
    :cond_0
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 327
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 332
    invoke-virtual {p0}, Lm;->onBackPressed()V

    .line 333
    const/4 v0, 0x1

    .line 336
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onLowMemory()V
    .locals 1

    .prologue
    .line 344
    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    .line 345
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->q()V

    .line 346
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 353
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 354
    const/4 v0, 0x1

    .line 365
    :goto_0
    return v0

    .line 357
    :cond_0
    sparse-switch p1, :sswitch_data_0

    .line 365
    const/4 v0, 0x0

    goto :goto_0

    .line 359
    :sswitch_0
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0, p2}, Lt;->a(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0

    .line 362
    :sswitch_1
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0, p2}, Lt;->b(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0

    .line 357
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x6 -> :sswitch_1
    .end sparse-switch
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 408
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 409
    iget-object v0, p0, Lm;->b:Lt;

    .line 6919
    const/4 v1, 0x0

    iput-boolean v1, v0, Lt;->j:Z

    .line 410
    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    .prologue
    .line 374
    packed-switch p1, :pswitch_data_0

    .line 379
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    .line 380
    return-void

    .line 376
    :pswitch_0
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0, p2}, Lt;->b(Landroid/view/Menu;)V

    goto :goto_0

    .line 374
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onPause()V
    .locals 3

    .prologue
    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 387
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 388
    iput-boolean v2, p0, Lm;->g:Z

    .line 389
    iget-object v0, p0, Lm;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 390
    iget-object v0, p0, Lm;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 5447
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->m()V

    .line 393
    :cond_0
    iget-object v0, p0, Lm;->b:Lt;

    .line 5943
    const/4 v1, 0x4

    invoke-virtual {v0, v1, v2}, Lt;->a(IZ)V

    .line 394
    return-void
.end method

.method public onPostResume()V
    .locals 2

    .prologue
    .line 434
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 435
    iget-object v0, p0, Lm;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 7447
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->m()V

    .line 437
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->h()Z

    .line 438
    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 455
    if-nez p1, :cond_1

    if-eqz p3, :cond_1

    .line 456
    iget-boolean v0, p0, Lm;->i:Z

    if-eqz v0, :cond_0

    .line 457
    iput-boolean v1, p0, Lm;->i:Z

    .line 458
    invoke-interface {p3}, Landroid/view/Menu;->clear()V

    .line 459
    invoke-virtual {p0, p1, p3}, Lm;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 7472
    :cond_0
    invoke-super {p0, v1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    .line 462
    iget-object v1, p0, Lm;->b:Lt;

    invoke-virtual {v1, p3}, Lt;->a(Landroid/view/Menu;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 465
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method public onResume()V
    .locals 2

    .prologue
    .line 423
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 424
    iget-object v0, p0, Lm;->a:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 425
    const/4 v0, 0x1

    iput-boolean v0, p0, Lm;->g:Z

    .line 426
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->h()Z

    .line 427
    return-void
.end method

.method public final onRetainNonConfigurationInstance()Ljava/lang/Object;
    .locals 9

    .prologue
    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v4, 0x0

    .line 482
    iget-boolean v0, p0, Lm;->c:Z

    if-eqz v0, :cond_0

    .line 483
    invoke-virtual {p0, v6}, Lm;->a(Z)V

    .line 488
    :cond_0
    iget-object v7, p0, Lm;->b:Lt;

    .line 7615
    iget-object v0, v7, Lt;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    move v3, v4

    move-object v1, v5

    .line 7616
    :goto_0
    iget-object v0, v7, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_5

    .line 7617
    iget-object v0, v7, Lt;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj;

    .line 7618
    if-eqz v0, :cond_2

    iget-boolean v2, v0, Lj;->G:Z

    if-eqz v2, :cond_2

    .line 7619
    if-nez v1, :cond_1

    .line 7620
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7622
    :cond_1
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7623
    iput-boolean v6, v0, Lj;->H:Z

    .line 7624
    iget-object v2, v0, Lj;->n:Lj;

    if-eqz v2, :cond_3

    iget-object v2, v0, Lj;->n:Lj;

    iget v2, v2, Lj;->k:I

    :goto_1
    iput v2, v0, Lj;->o:I

    .line 7616
    :cond_2
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_0

    .line 7624
    :cond_3
    const/4 v2, -0x1

    goto :goto_1

    :cond_4
    move-object v1, v5

    .line 490
    :cond_5
    iget-object v0, p0, Lm;->l:Lep;

    if-eqz v0, :cond_8

    .line 493
    iget-object v0, p0, Lm;->l:Lep;

    invoke-virtual {v0}, Lep;->size()I

    move-result v3

    .line 494
    new-array v7, v3, [Lar;

    .line 495
    add-int/lit8 v0, v3, -0x1

    move v2, v0

    :goto_2
    if-ltz v2, :cond_6

    .line 496
    iget-object v0, p0, Lm;->l:Lep;

    invoke-virtual {v0, v2}, Lep;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lar;

    aput-object v0, v7, v2

    .line 495
    add-int/lit8 v0, v2, -0x1

    move v2, v0

    goto :goto_2

    :cond_6
    move v0, v4

    .line 498
    :goto_3
    if-ge v4, v3, :cond_9

    .line 499
    aget-object v2, v7, v4

    .line 500
    iget-boolean v8, v2, Lar;->g:Z

    if-eqz v8, :cond_7

    move v0, v6

    .line 498
    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 503
    :cond_7
    invoke-virtual {v2}, Lar;->g()V

    .line 504
    iget-object v8, p0, Lm;->l:Lep;

    iget-object v2, v2, Lar;->d:Ljava/lang/String;

    invoke-virtual {v8, v2}, Lep;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_8
    move v0, v4

    .line 508
    :cond_9
    if-nez v1, :cond_a

    if-nez v0, :cond_a

    .line 518
    :goto_5
    return-object v5

    .line 512
    :cond_a
    new-instance v5, Lp;

    invoke-direct {v5}, Lp;-><init>()V

    .line 516
    iput-object v1, v5, Lp;->a:Ljava/util/ArrayList;

    .line 517
    iget-object v0, p0, Lm;->l:Lep;

    iput-object v0, v5, Lp;->b:Lep;

    goto :goto_5
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 526
    invoke-super {p0, p1}, Landroid/app/Activity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 527
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->i()Landroid/os/Parcelable;

    move-result-object v0

    .line 528
    if-eqz v0, :cond_0

    .line 529
    const-string v1, "android:support:fragments"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 531
    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 9

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 539
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 541
    iput-boolean v3, p0, Lm;->c:Z

    .line 542
    iput-boolean v3, p0, Lm;->h:Z

    .line 543
    iget-object v0, p0, Lm;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 545
    iget-boolean v0, p0, Lm;->f:Z

    if-nez v0, :cond_0

    .line 546
    iput-boolean v2, p0, Lm;->f:Z

    .line 547
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->k()V

    .line 550
    :cond_0
    iget-object v0, p0, Lm;->b:Lt;

    .line 7919
    iput-boolean v3, v0, Lt;->j:Z

    .line 551
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->h()Z

    .line 553
    iget-boolean v0, p0, Lm;->k:Z

    if-nez v0, :cond_2

    .line 554
    iput-boolean v2, p0, Lm;->k:Z

    .line 555
    iget-object v0, p0, Lm;->m:Lar;

    if-eqz v0, :cond_3

    .line 556
    iget-object v0, p0, Lm;->m:Lar;

    invoke-virtual {v0}, Lar;->b()V

    .line 564
    :cond_1
    :goto_0
    iput-boolean v2, p0, Lm;->j:Z

    .line 568
    :cond_2
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->l()V

    .line 569
    iget-object v0, p0, Lm;->l:Lep;

    if-eqz v0, :cond_a

    .line 570
    iget-object v0, p0, Lm;->l:Lep;

    invoke-virtual {v0}, Lep;->size()I

    move-result v4

    .line 571
    new-array v5, v4, [Lar;

    .line 572
    add-int/lit8 v0, v4, -0x1

    move v1, v0

    :goto_1
    if-ltz v1, :cond_4

    .line 573
    iget-object v0, p0, Lm;->l:Lep;

    invoke-virtual {v0, v1}, Lep;->c(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lar;

    aput-object v0, v5, v1

    .line 572
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_1

    .line 557
    :cond_3
    iget-boolean v0, p0, Lm;->j:Z

    if-nez v0, :cond_1

    .line 558
    const-string v0, "(root)"

    iget-boolean v1, p0, Lm;->k:Z

    invoke-virtual {p0, v0, v1, v3}, Lm;->a(Ljava/lang/String;ZZ)Lar;

    move-result-object v0

    iput-object v0, p0, Lm;->m:Lar;

    .line 560
    iget-object v0, p0, Lm;->m:Lar;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lm;->m:Lar;

    iget-boolean v0, v0, Lar;->f:Z

    if-nez v0, :cond_1

    .line 561
    iget-object v0, p0, Lm;->m:Lar;

    invoke-virtual {v0}, Lar;->b()V

    goto :goto_0

    :cond_4
    move v2, v3

    .line 575
    :goto_2
    if-ge v2, v4, :cond_a

    .line 576
    aget-object v6, v5, v2

    .line 8750
    iget-boolean v0, v6, Lar;->g:Z

    if-eqz v0, :cond_9

    .line 8751
    sget-boolean v0, Lar;->a:Z

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Finished Retaining in "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 8753
    :cond_5
    iput-boolean v3, v6, Lar;->g:Z

    .line 8754
    iget-object v0, v6, Lar;->b:Leq;

    invoke-virtual {v0}, Leq;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_3
    if-ltz v1, :cond_9

    .line 8755
    iget-object v0, v6, Lar;->b:Leq;

    invoke-virtual {v0, v1}, Leq;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Las;

    .line 9278
    iget-boolean v7, v0, Las;->h:Z

    if-eqz v7, :cond_7

    .line 9279
    sget-boolean v7, Lar;->a:Z

    if-eqz v7, :cond_6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "  Finished Retaining: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9280
    :cond_6
    iput-boolean v3, v0, Las;->h:Z

    .line 9281
    iget-boolean v7, v0, Las;->g:Z

    iget-boolean v8, v0, Las;->i:Z

    if-eq v7, v8, :cond_7

    .line 9282
    iget-boolean v7, v0, Las;->g:Z

    if-nez v7, :cond_7

    .line 9286
    invoke-virtual {v0}, Las;->b()V

    .line 9291
    :cond_7
    iget-boolean v7, v0, Las;->g:Z

    if-eqz v7, :cond_8

    iget-boolean v7, v0, Las;->d:Z

    if-eqz v7, :cond_8

    iget-boolean v7, v0, Las;->j:Z

    if-nez v7, :cond_8

    .line 9298
    iget-object v7, v0, Las;->c:Lbi;

    iget-object v8, v0, Las;->f:Ljava/lang/Object;

    invoke-virtual {v0, v7, v8}, Las;->b(Lbi;Ljava/lang/Object;)V

    .line 8754
    :cond_8
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_3

    .line 578
    :cond_9
    invoke-virtual {v6}, Lar;->f()V

    .line 575
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_2

    .line 581
    :cond_a
    return-void
.end method

.method public onStop()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 588
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 590
    iput-boolean v1, p0, Lm;->c:Z

    .line 591
    iget-object v0, p0, Lm;->a:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 593
    iget-object v0, p0, Lm;->b:Lt;

    invoke-virtual {v0}, Lt;->o()V

    .line 594
    return-void
.end method

.method public startActivityForResult(Landroid/content/Intent;I)V
    .locals 2

    .prologue
    .line 817
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    const/high16 v0, -0x10000

    and-int/2addr v0, p2

    if-eqz v0, :cond_0

    .line 818
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can only use lower 16 bits for requestCode"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 820
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 821
    return-void
.end method
